# Scoped Aspose.Slides compatibility plan

Drafted: 2026-11-03. Revised scope: **modern presentation compatibility against Aspose.Slides for Java 26.9**, implemented as an independent C# library and exposed through the existing ASP.NET Core service. Legacy PowerPoint document formats and SWF export are excluded; additional candidates are identified below.

The project currently has no presentation operations. Achieving parity requires a presentation object model, reliable package editing, layout and rendering engines, and several format codecs. Open XML SDK is the foundation for OOXML storage; it does not supply this entire product. Its own documentation describes its role as low-level package and markup manipulation rather than higher-level abstractions. [Open XML SDK scope](https://github.com/dotnet/Open-XML-SDK)

## 1. Baseline and evidence

| Item | Observed state | Evidence |
| --- | --- | --- |
| Application | Minimal API with `GET /` and `GET /health` only | [Program.cs](Program.cs) |
| Platform | .NET 10, nullable enabled | [Prestr.Pptx.csproj](Prestr.Pptx.csproj) |
| Document dependency | `DocumentFormat.OpenXml` 3.5.1 installed; no presentation code uses it yet | [Prestr.Pptx.csproj](Prestr.Pptx.csproj) |
| Engineering infrastructure | No test project, solution, CI workflow, document model, renderer, or conversion layer in the inspected project | Repository inventory and [README.md](README.md) |
| Reference binary | Aspose.Slides for Java 26.9; manifest release date 2026-09-30 | [JAR](reference/aspose-slides-26.9-jdk16.jar), [manifest](reference/aspose-slides-26.9/META-INF/MANIFEST.MF) |
| Reference source | Public APIs plus substantial obfuscated internals and decompiler-style constructs; original-source provenance and rebuildability are unverified | [source tree](reference/aspose-slides-26.9/com/aspose/slides), [Presentation.java](reference/aspose-slides-26.9/com/aspose/slides/Presentation.java) |
| Documentation | Live Java API reference and developer documentation; may contain additions after 26.9 | [API index](https://reference.aspose.com/slides/java/com.aspose.slides/) |

Reference JAR SHA-256:

```text
9b80f20b54edbc73afb0c060b0c6785c32bd48d33b984d5f96a12f7c4bf9fde0
```

This draft is based on repository inspection, static JAR inventory, sampled `javap` signatures, supplied Java source, and official documentation. It does **not** claim runtime parity, a complete member census, or measured implementation effort. REA inventory evidence `ev_9e0438f163d0066d5a4914e5b5e5484dd2a039608f41bca2aecf6cc2e4fef4f1` establishes archive identity and entries, not runtime behavior. No application functionality is implemented by this plan.

## 2. Define parity before measuring progress

The target is the retained, externally observable presentation functionality of the supplied Java release, subject to the scope decisions below. Use idiomatic C# properties, collections, streams, cancellation, and disposal, with an explicit mapping from Java APIs. This is not a promise of source compatibility with Aspose's separate .NET product or of full Aspose feature parity.

### 2.1 Applied legacy exclusions

The user's direction removes legacy PowerPoint document support. SWF is also excluded as a related legacy output. These exclusions apply to all import/export directions, associated options, helpers, compatibility quirks, and positive conformance tests.

| Exclude | Work removed | Retained boundary |
| --- | --- | --- |
| Binary PowerPoint `.ppt`, `.pps`, `.pot` | Binary record parsers/writers, version-specific roundtrips, old master/text/animation representations, binary-format encryption and all conversions to/from these documents | Return a clear unsupported-format error; preserve modern `.pptx/.ppsx/.potx` support |
| PowerPoint 95 and precise historical-version identification | Historical detection taxonomy, exception compatibility and any import investigation | Generic unsupported-input rejection is enough; no need to reproduce `LoadFormat.Ppt95` behavior |
| SWF / Flash export | SWF writer, SWF-specific options, media packaging and playback compatibility tests | Modern animation XML, HTML5, GIF and frame generation remain separate features |
| Legacy-only options, helpers and behavioral quirks | Code and tests whose only reachable use is one of the excluded formats | Keep shared algorithms still needed by retained formats; deprecation alone is not a reason to remove a useful modern operation |

The formats are distinct entries in the supplied [LoadFormat](reference/aspose-slides-26.9/com/aspose/slides/LoadFormat.java) and [SaveFormat](reference/aspose-slides-26.9/com/aspose/slides/SaveFormat.java). This removes a complete legacy document-codec workstream. PowerPoint 95 rejection behavior itself saves little implementation effort; binary PPT read/write is the substantial cut.

### 2.2 Recommended next exclusions

These are recommendations for further scope reduction, **not yet applied exclusions**. The later roadmap retains them until a scope decision selects them. The effort assessments are qualitative dependency estimates, not measured savings.

| Candidate | Recommended reduced contract | Benefit and tradeoff |
| --- | --- | --- |
| ActiveX control authoring and property APIs | Preserve existing controls, relationships and available preview images; omit create/edit/control-specific APIs | Removes a desktop-specific object model; controls remain usable in the original application when preserved |
| VBA project/module/reference editing | Preserve macro payloads in `.pptm/.ppsm/.potm`; omit macro authoring, code inspection and VBA signature creation | Avoids a VBA project subsystem without dropping macro-enabled OOXML containers. Signature validity must still be handled explicitly |
| OLE object authoring, native payload editing and link refresh | Preserve object bytes, relationships and placement; render stored previews where available; omit creating/modifying native object contents | Avoids embedded-application integration. An embedded chart workbook is a separate retained feature |
| Legacy diagram semantic APIs | Preserve old diagram parts and available cached drawings; omit old diagram creation, editing and regeneration | Removes a legacy model/layout path; modern SmartArt remains fully in scope |
| XPS, XAML and EMF **export** | Standardize on PDF, SVG and raster output | Removes specialized writers and option/test matrices. This does not remove embedded EMF/WMF input handling |
| Standalone PowerPoint XML input/output | Support packaged OOXML documents; omit `SaveFormat.Xml` and matching standalone-file loading | Avoids an additional document serialization surface. This does not remove PresentationML, DrawingML, custom XML, or normal PPTX internals |
| Deprecated API aliases and redundant factory overloads | Provide one idiomatic C# operation per retained behavior rather than mirroring obsolete Java entry points | Reduces facade/test maintenance, usually modest engine savings; document the mapping |

VBA manipulation and OLE manipulation are separate public capabilities, so their semantic APIs can be omitted while package preservation remains. [VBA API scope](https://docs.aspose.com/slides/java/presentation-via-vba/), [OLE API scope](https://docs.aspose.com/slides/java/manage-ole/)

### 2.3 Larger optional reductions that are not legacy removals

| Candidate | What could be omitted | What remains / cost of omission |
| --- | --- | --- |
| ODP, OTP, FODP | Entire ODF reader/writer and cross-format mapping | Large independent codec reduction if interoperability is unnecessary; ODF is not an obsolete binary PowerPoint format |
| PDF/HTML **import** | Reconstruction of editable slide objects from these inputs | Keep PDF/HTML export; users must supply PowerPoint inputs |
| Animation playback and animated exports | Frame evaluator, animated GIF/HTML5 behavior and video-encoder integration | Preserve and edit animation/transition XML for playback in PowerPoint; static rendering remains. Potentially substantial engine reduction |
| Advanced 3D rendering | Scene/material/light/camera rasterization | Preserve settings; flattened or approximate output must be disclosed, so this reduces visual compatibility |
| AI helpers | Provider orchestration for presentation generation/translation | Core document functionality is unaffected; these can be a separate application layer |
| Web templates, Markdown, TIFF/GIF/BMP output variants | Optional adapters/writers and their options | Keep required delivery formats such as PDF/PNG/JPEG/SVG; often smaller savings than removing layout engines |
| Signature creation and sensitivity-label authoring | Certificate/signing and enterprise label-management APIs | Preserve metadata where valid and report invalidated signatures; encryption and password handling are separate decisions |

SmartArt, charts, tables, equations, modern comments, multilingual text, font handling and accurate layout are **not** removed by the legacy direction. They remain central to the current compatibility objective even when expensive to implement.

### 2.4 Preservation rules for the reduced scope

- Removing a legacy document codec does not authorize dropping unknown parts from a supported OOXML document. Keep opaque parts, relationships and binary payloads intact during unrelated edits and supported cloning.
- Macro-enabled `.pptm/.ppsm/.potm` files are OOXML, not binary `.ppt` files. They can remain supported even if VBA editing is later excluded. Conversion to a macro-free type must report or require an explicit content-loss policy.
- Embedded EMF/WMF graphics, OLE previews, fonts, media and chart workbooks can occur in modern presentations. Keep relevant input/rendering support; exclude a codec only after checking its uses in retained features. Binary `.xls` workbooks can be preserved and use valid chart caches initially; editable recalculation for those workbooks needs an explicit capability decision rather than an implicit claim of parity.
- Preserve classic comments as well as modern comments. Their presence inside PPTX does not make the file a legacy binary presentation.
- Keep the OOXML encryption path: an encrypted OOXML package can use compound-file storage containing `EncryptionInfo` and `EncryptedPackage`. Do not reject every compound-file signature as binary PPT. [Encrypted package structure](https://learn.microsoft.com/en-us/openspecs/office_file_formats/ms-offcrypto/b60c8b35-2db2-4409-8710-59d88a793f83)
- If an excluded object cannot be rendered, use a valid stored preview when available and report the limitation; never silently omit it or claim full visual fidelity. Edits that would invalidate preserved content need an explicit unsupported-operation result or documented loss policy.
- Test exclusions with a small rejection/preservation suite. Do not build full legacy engines merely to reproduce Aspose's historical error details.

### 2.5 Measure the retained contract

Track these dimensions independently for every feature:

| Dimension | Required evidence |
| --- | --- |
| API and behavior | Equivalent operations, defaults, overload behavior, enum meanings, units, collection ordering, ownership, exceptions, callbacks, and disposal |
| Read | Existing content and settings are exposed correctly, including inherited values |
| Create/edit | Mutations produce correct, independently editable content |
| Preserve | Untouched content, relationships, extensions, and embedded resources survive save/reopen |
| Layout/render | Geometry, text metrics, visual output, and applicable animation frames match the reference within defined tolerances |
| Import/export | Each supported direction, option, and content transformation behaves correctly |
| Operational | Cancellation, resource use, stream ownership, warnings, concurrency boundaries, and failure handling are usable and tested |

Preserving a SmartArt drawing does not establish node-editing or layout parity. Writing animation XML does not establish playback parity. Saving a PDF does not establish font, hyperlink, accessibility, or layout parity. Installing the SDK establishes none of these dimensions by itself.

Create a machine-readable ledger at `compat/aspose-26.9/features.json` with:

- Stable feature/scenario ID; Java type/member/overload; corresponding C# API; applicable formats and dimensions.
- JAR signature, source path, documentation URL and retrieval date, and runtime observation where available.
- Defaults, constraints, unsupported combinations, dependencies, owning workstream, and milestone.
- Scope per operation/dimension: `included`, `excluded`, or `candidate-for-exclusion`, with rationale and decision provenance. Candidates count as included until selected; an excluded edit API can still have an included preservation requirement.
- Status per dimension: `unverified`, `missing`, `preserved-only`, `partial`, `verified`, or `not-applicable` with a reason.
- Fixture/test IDs, expected results, tolerances, and known differences. A stub or unconditional unsupported exception cannot count as implemented support.

Maintain both a public-member inventory and a scenario inventory. Member counts alone overstate progress and obscure difficult behavior. Published coverage must identify its retained denominator, explicit exclusions, feature families, and remaining gaps. Excluded functionality is not an implementation defect and cannot count as a passing feature. Priorities change delivery order; scope changes require a recorded decision.

Include convenience APIs and provider-dependent features in the ledger. Record vendor license activation/metering and Java runtime compatibility machinery separately as non-presentation infrastructure. Preserve the distinction between those exclusions and unfinished presentation functionality. Production code must operate independently of the Aspose JAR; use the reference only in isolated compatibility tooling.

## 3. Complete the feature inventory

All retained presentation capabilities below currently start as **missing**. Applied exclusions in Section 2.1 override the original full-parity objective; candidates in Sections 2.2–2.3 remain planned until selected. Phase 0 must expand this work breakdown to members and scenarios rather than treating the table as an exhaustive API census.

| Workstream | Required scope | Main dependencies / evidence |
| --- | --- | --- |
| Document lifecycle and package model | Create/open/save; paths/streams; format detection; document info; properties-only loading; properties/custom properties; stream ownership; disposal; warning and interruption options | [IPresentation](reference/aspose-slides-26.9/com/aspose/slides/IPresentation.java), `PresentationFactory`, `LoadOptions`, `SaveOptions` |
| Presentation structure | Slides, sections, sizes, hidden slides, show settings, views/guides, notes and handouts, headers/footers, layouts, masters, placeholders; clone, merge, remove, reorder, and cleanup | Relationship graph and stable object identity |
| Themes and effective formatting | Color/font/format schemes, overrides, backgrounds, style references, placeholder inheritance, effective read-only values and invalidation | Required by text, tables, charts, and rendering |
| Shapes and geometry | Preset and custom paths, adjustment formulas, groups, connectors and routing, coordinate transforms, z-order, flips/rotation, locks, hyperlinks/actions, alternative text | `ShapeCollection`, `GeometryShape`, `GeometryPath`, `Connector` |
| Visual styles | Solid/gradient/pattern/picture fills, strokes, arrowheads, shadows, glow, blur, transparency, image transforms, reflection, 3D scene/material/light/camera behavior | Geometry and shared scene representation |
| Text and fonts | Paragraphs/runs/fields, bullets/numbering, tabs, spacing, columns, RTL/vertical text, language, word art, autofit, text extraction/search/replace/highlight, HTML text operations, bounds and line counts; embedded/external fonts, substitution and glyph fallback | `TextFrame`, `Paragraph`, `Portion`, `FontsManager`; shaping and measurement |
| Images and media | Raster/vector image handling, SVG and metafiles, crop/stretch/tile, image effects, compression, deduplication; audio/video frames, poster frames, playback settings, captions, embedded/linked resources | Media store, codecs, resource resolver |
| Tables | Rows/columns/cells, add/remove/resize, merge/split, borders, styles/banding, RTL, rich text, effective formats, actual layout | Text layout and style resolution |
| Charts and workbooks | Every supported chart family and combination; series/categories/data points, axes, labels, legends, trends/error bars, 3D, chart layout; embedded/external workbooks, caches, formulas, workbook import | [IChartDataWorkbook](reference/aspose-slides-26.9/com/aspose/slides/IChartDataWorkbook.java), `ChartType`, `ExcelWorkbookImporter` |
| SmartArt and legacy diagrams | Nodes/hierarchy/assistants/order, layouts, colors/styles, generated shape geometry, text, editing and rendering; preserve legacy diagram representations | Dedicated diagram model and layout engine |
| Math | Editable equation structures, OMML serialization, equation layout and rendering, supported MathML export | `IMathParagraph` and math type family; mathematical typography |
| Animation and presentation navigation | Sequences, effects, behaviors, timing, triggers, motion paths, transitions, playback/frame generation; slide/section/summary Zoom | Timeline model, scene evaluation, media handling |
| Collaboration and document extensions | Classic/modern comments and authors, custom XML, tags/custom data, ink traces/brushes, accessibility metadata, sensitivity-label operations | Extension-aware package storage |
| Embedded and programmable content | OLE embedded/linked objects and previews, ActiveX controls/properties, VBA projects/modules/references and applicable signatures | Preserve binary parts; expose supported edits without executing embedded programs |
| Protection and signatures | Encryption/decryption, password checks, write protection, read-only recommendations, document signatures, validation, and signature invalidation after edits | Package encryption and signature services; distinguish these mechanisms |
| Rendering and output | Slide/shape/paragraph images and bounds; SVG/EMF, PDF/XPS, HTML/HTML5/web templates, Markdown, XAML, TIFF/GIF; notes/comments/handout layouts; SWF excluded | Shared layout/scene plus output-specific writers; niche writers are exclusion candidates |
| Additional input formats | ODF, PowerPoint XML, PDF/HTML slide import; binary PowerPoint excluded | Separate readers and mapping into the common model; remaining readers are exclusion candidates |
| Utility and integration surface | Conversion/merge/compress/traversal helpers, resource callbacks, progress/warnings, BLOB and temporary-file controls, AI generation/translation with injected providers | `Convert`, `Merger`, `Compress`, `ForEach`, `WebDocument`, `SlidesAIAgent` |

The supplied [IPresentation](reference/aspose-slides-26.9/com/aspose/slides/IPresentation.java), [ISlide](reference/aspose-slides-26.9/com/aspose/slides/ISlide.java), and [IShape](reference/aspose-slides-26.9/com/aspose/slides/IShape.java) anchor the object model. The official [features overview](https://docs.aspose.com/slides/java/features-overview/) provides a supplementary discovery checklist; verify its entries against 26.9.

## 4. Track format support by direction

Do not infer conversion behavior from a filename extension or enum constant. The local [LoadFormat](reference/aspose-slides-26.9/com/aspose/slides/LoadFormat.java), [SaveFormat](reference/aspose-slides-26.9/com/aspose/slides/SaveFormat.java), [SourceFormat](reference/aspose-slides-26.9/com/aspose/slides/SourceFormat.java), and [ISlideCollection](reference/aspose-slides-26.9/com/aspose/slides/ISlideCollection.java) provide separate surfaces.

| Format / operation | Planned coverage | Qualification |
| --- | --- | --- |
| PPTX, PPSX, POTX | Load, edit, save, render, convert | First delivery family; correct content types and template/show semantics |
| PPTM, PPSM, POTM | Load/edit/save with VBA preservation and supported VBA APIs | Preserve relationships and macro content; handle signatures explicitly |
| PPT, PPS, POT | **Excluded**: read/write and all conversions | Clear unsupported-format error; no binary document codec |
| ODP, OTP, FODP | Read/write and conversion | Dedicated ODF mapping, with explicit loss diagnostics |
| PowerPoint XML | Verify 26.9 detection/loading, then load/save/convert | `SourceFormat.Xml` and `SaveFormat.Xml` exist; `LoadFormat.Xml` does not. Do not equate this format with arbitrary XML or assume Flat OPC equivalence |
| PowerPoint 95 | **Excluded**, including exact detection/error compatibility | Generic unsupported-input rejection; no historical-version taxonomy |
| PDF and HTML input | Import content through slide collection APIs | Separate from presentation constructor/load-format support; test editability and external-resource resolution |
| PDF, XPS | Document export, including supported options | Layout, font treatment, navigation, security, compliance and accessibility where exposed |
| HTML, HTML5, web documents | Export and supported templating/resource control | Static versus animated behavior must be tested separately |
| TIFF, animated GIF | Presentation export | Multipage/image options and timeline behavior as applicable |
| Markdown | Export | Preserve the reference's text, ordering, image and resource policies |
| SWF | **Excluded** | No Flash writer, options or playback compatibility work |
| XAML | Export through the options-based save API | Not a `SaveFormat` entry |
| PNG/JPEG/BMP/GIF/TIFF, SVG, EMF | Applicable slide/shape/paragraph image or vector APIs | Verify each object/API combination; these are not all document save formats |
| Animation frames / video workflow | Generate frames and support an encoder integration contract | Do not invent a native MP4 save format |

The official [format matrix](https://docs.aspose.com/slides/java/supported-file-formats/) distinguishes opening, slide import, saving, and rendering. Treat documentation/JAR disagreements as investigation items, not inferred support. The documented [video workflow](https://docs.aspose.com/slides/java/convert-powerpoint-to-video/) generates frames and uses an external encoder.

## 5. Architecture

Build a reusable library first and keep HTTP concerns in the host. Introduce logical boundaries before multiplying assemblies; split independently testable engines as they become substantial.

```text
ASP.NET Core host / C# consumer
            |
Presentation API and semantic document model
            |
  +---------+--------------------+-------------------+
  |                              |                   |
Package graph / OOXML       Style resolution     Other format codecs
(Open XML SDK)             and font services     (ODF, XML, imports)
  |                              |
Opaque parts / media        Layout and geometry
                                 |
                        Resolved scene + timeline
                                 |
                      Raster / vector / document writers
```

Proposed repository layout:

```text
src/Prestr.Pptx.Api/                 Existing web host
src/Prestr.Pptx/                     Public API and semantic model
src/Prestr.Pptx.OpenXml/             Package graph, reader/writer, preservation
src/Prestr.Pptx.Layout/              Styles, fonts, text/shape/object layout
src/Prestr.Pptx.Rendering/           Scene evaluation and output backends
src/Prestr.Pptx.Formats/             Additional codecs and import/export adapters
tests/Prestr.Pptx.UnitTests/
tests/Prestr.Pptx.CompatibilityTests/
tests/Prestr.Pptx.IntegrationTests/
tools/compat/                       Java oracle, C# runner, comparison/reporting
compat/aspose-26.9/                 Inventories, feature ledger, baselines
testdata/                           Small fixtures, expected semantics, manifests
benchmarks/                         Repeatable CPU/memory/output measurements
```

Important design decisions:

1. **A model backed by preserved package data.** Hide SDK elements behind internal adapters. Maintain a mapping between model objects and source parts/elements, retain unmodeled XML/attributes and opaque parts, and write only intended changes. Avoid rebuilding every file from a lossy model.
2. **A relationship-aware document graph.** Centralize part ownership, references, IDs, clone/merge dependency closure, media reuse, and garbage collection. Cross-presentation cloning must remap layouts, masters, themes, notes, charts/workbooks, links, and embedded resources.
3. **Explicit values and effective values.** Keep inherited/default values distinct from stored overrides; resolve the real property-specific precedence rules. Invalidate effective values and layout caches when ancestors change. Aspose exposes resolved values as snapshots. [Effective properties](https://docs.aspose.com/slides/java/shape-effective-properties/)
4. **Shared layout for all backends.** Resolve styles, shape geometry, text lines/glyphs, tables, charts, diagrams and math into a scene with stable bounds, transforms, clipping, and drawing order. Use it for measurement, rendering, hit regions, and output so each writer does not invent its own layout.
5. **Fonts as an explicit service.** Separate document font replacement, rendering substitution, per-glyph fallback, discovery and embedding. Pin fonts and locale for comparisons; fallback configuration can be runtime-only. [Font fallback](https://docs.aspose.com/slides/java/fallback-font/), [font embedding](https://docs.aspose.com/slides/java/embedded-font/)
6. **Specialized engines behind interfaces.** Chart calculation/layout, SmartArt, math, raster/vector codecs, PDF writing, OOXML cryptography, retained interoperability formats, and media encoding need replaceable boundaries. Omit the binary PowerPoint codec and SWF writer. Run small compatibility/portability spikes before choosing dependencies; do not assume a drawing library provides PowerPoint layout.
7. **Clear failure and loss reporting.** Unsupported operations return structured errors or warnings with affected objects and options. A conversion adapter may offer partial functionality, but its differences stay visible in the parity report.
8. **Document-isolated state.** Use per-document mutable state and explicitly safe shared immutable caches. Define cancellation, disposal, stream ownership, resource resolution, and bounded temporary storage early. Do not promise concurrent mutation of a document without reference evidence and a deliberate design.

## 6. Delivery phases and exit gates

Every phase produces working vertical scenarios, fixtures, documentation, and updates to the ledger. Later retained features remain incomplete until their own gates pass. Resolve candidate exclusions before investing in their engines; if selected, remove dependent tasks and keep only their stated preservation/rejection tests. Rendering and retained specialized codecs need early feasibility work even though full delivery comes later.

### Phase 0 — Freeze the contract and build the compatibility harness

- [ ] Record JAR/source identities, manifest, Java runtime, documentation snapshots/dates, fonts, OS and locale in a reproducible reference manifest.
- [ ] Choose the supported OS/CPU/runtime matrix before selecting font, graphics, codec and cryptography dependencies; distinguish reference execution platforms from production deployment platforms.
- [ ] Enumerate public/protected members, overloads, inherited contract, constants, callbacks and helper classes from the JAR; cross-check documentation and source. Separate synthetic/internal/Java support types from the product contract.
- [ ] Expand the feature and directional format ledgers with applied exclusions and candidate decisions. Record which preservation dimensions remain in scope. Investigate defaults and unsupported behavior only for the retained contract.
- [ ] Create a small Java runner using the supplied JAR and a C# runner driven by the same versioned scenario JSON. Emit semantic JSON, files, warnings/errors, and resource measurements.
- [ ] Provide a licensed or suitable temporary-license oracle environment before accepting golden outputs. Evaluation mode can watermark output and truncate text; tag evaluation-only results and exclude them from conformance baselines. [Evaluation behavior](https://docs.aspose.com/slides/java/getting-started/)
- [ ] Seed fixtures for blank documents, theme inheritance, cross-deck clones, mixed-script text, tables, charts, SmartArt, math, animation, macros, embedded objects, and format conversions.
- [ ] Spike the highest-risk retained paths: complex text layout, a chart, modified SmartArt, vector/PDF output and ODF if retained after the scope review. Measure candidate approaches and document choices; do not prototype excluded binary PPT or SWF engines.

**Exit:** Reproducible inventories and runners; several end-to-end oracle scenarios; explicit unknowns; an engine/dependency decision record and a revised estimate. No percentage-parity claim until the denominator is stable.

### Phase 1 — Library boundaries and loss-resistant PPTX lifecycle

- [ ] Introduce the solution, library/test projects, SDK pinning, and CI. Move the host under `src` and update run instructions; ensure the root SDK glob cannot accidentally compile test/tool C# files.
- [ ] Implement create/open/save/dispose, streams, format detection, document properties, slide size and slide enumeration.
- [ ] Reject excluded legacy document formats clearly while distinguishing encrypted OOXML containers; add preservation tests for legacy payloads embedded in supported documents.
- [ ] Implement package/content-type/relationship services, object IDs, unknown-part and markup-compatibility preservation, and targeted writes.
- [ ] Add input limits, bounded ZIP/XML parsing, cleanup on failure, cancellation boundaries, and structured load/save diagnostics.
- [ ] Add the first service operation over the library, with validation, clear errors and an integration test; keep document processing out of `Program.cs`.

**Exit:** Blank create/save/reopen works; the initial no-op corpus retains semantic content and opaque payloads; schema and relationship checks pass; independently opened files require no repair.

### Phase 2 — Presentation structure, themes, and inheritance

- [ ] Add/delete/reorder/clone slides and sections; clone across documents with dependencies and internal links.
- [ ] Implement masters, layouts, placeholders, themes, backgrounds, notes/handout masters, headers/footers, view and show settings.
- [ ] Implement effective color/font/fill/line/text style resolution and mutation-driven invalidation.
- [ ] Implement common shape identity, transforms, grouping, z-order, names, locks, hyperlinks and accessibility metadata.

**Exit:** Cross-deck clone/merge scenarios retain content and correct inheritance. Theme/master changes update effective properties while preserving explicit overrides. Repeated save/reopen does not accumulate orphan parts.

### Phase 3 — Text, geometry, images, and baseline rendering

- [ ] Implement rich text, fields, bullets, tabs, spacing, search/replace across runs, text extraction/highlighting, and relevant HTML text APIs.
- [ ] Implement preset/custom geometry, adjustment evaluation, connectors, fills, lines, groups, transforms, images, crop and common effects.
- [ ] Build font discovery/substitution/fallback/embedding, shaping, line breaking, RTL/CJK/vertical text, autofit and text metrics.
- [ ] Introduce the resolved scene and initial raster/SVG outputs; support slide/shape/paragraph bounds and applicable image APIs.

**Exit:** Common authoring/editing scenarios are independently editable. Fixed-font visual fixtures meet initial tolerances, including multilingual text and inherited styles. API geometry agrees with rendered bounds.

### Phase 4 — Tables and chart engines

- [ ] Implement table structure, merged cells, sizing, cell text/layout, styles and borders.
- [ ] Implement chart data/workbook read-write, caches, series/categories/points, formulas and recalculation, external-workbook policies and workbook import.
- [ ] Deliver chart families in groups: common 2D; combinations/secondary axes; scatter/bubble/radar/stock; 3D; statistical/hierarchical/specialty types. Finish the exact `ChartType` inventory, including maps where supported.
- [ ] Implement labels, axes, scales, legends, trends/error bars, number formats, layout and chart rendering alongside data editing.

**Exit:** Edited charts retain editable workbook data and correct caches; formula results match the reference-supported subset; table/chart geometry and visuals pass targeted fixtures. Full Excel calculation is not implied by chart formula support. [Chart formulas](https://docs.aspose.com/slides/java/chart-worksheet-formulas/)

### Phase 5 — SmartArt, math, and advanced document content

- [ ] Implement SmartArt node APIs, hierarchy changes, layout/style/color changes, geometry regeneration, and legacy diagram handling.
- [ ] Implement editable math structures, OMML persistence, supported MathML export, and equation layout/rendering.
- [ ] Complete comments, custom XML/tags, ink, Zoom, OLE, ActiveX, VBA, captions and advanced media controls.
- [ ] Complete advanced image effects and 3D rendering features required by the inventoried reference surface.

**Exit:** SmartArt edits regenerate the displayed diagram; equation edits remain editable and render correctly; advanced parts survive related and unrelated mutations. Preserved caches alone do not satisfy these gates. [SmartArt behavior](https://docs.aspose.com/slides/java/manage-smartart/), [math API](https://docs.aspose.com/slides/java/powerpoint-math-equations/)

### Phase 6 — Production rendering and output formats

- [ ] Complete raster/vector rendering, image codecs, transparency, clipping, effects, font handling and selectable output resolution.
- [ ] Implement PDF/XPS writers and options: selected/hidden slides, notes/comments/handouts, text/font behavior, links, image compression, security, accessibility and compliance modes exposed by 26.9.
- [ ] Implement static HTML/web templating, Markdown, XAML, TIFF and applicable SVG/EMF/image APIs.
- [ ] Complete HTML5 and GIF output in conjunction with Phase 8 where playback is required; SWF is excluded.
- [ ] Validate vector/text preservation, metadata and output options as well as raster appearance. [PDF option surface](https://reference.aspose.com/slides/java/com.aspose.slides/pdfoptions/)

**Exit:** Each claimed format/option has independent-reader and differential tests. Compliance or accessibility modes pass appropriate validators; visually plausible output alone is insufficient.

### Phase 7 — Retained interoperability formats and imports

- [ ] Implement ODP/OTP/FODP and the confirmed PowerPoint XML format if retained after the scope review; no binary PPT/PPS/POT reader/writer is planned.
- [ ] Implement PDF/HTML slide import with configurable resources and tests for editable versus flattened results matching the reference behavior.
- [ ] Complete OOXML macro/template/show variants and retained-format detection/error behavior. Keep PowerPoint 95 and binary-format rejection generic; test preservation separately from semantic APIs for embedded legacy content.
- [ ] Test each required conversion direction independently and report format-specific losses; do not extrapolate all pairwise conversions from one successful export.

**Exit:** The directional format ledger is verified for its claimed rows. Roundtrip, editability and rendering expectations are explicit for inherently lossy conversions.

### Phase 8 — Animation, protection, integrations, and remaining API behavior

- [ ] Complete sequences, transitions, triggers, timing, motion paths, timeline evaluation and frame generation; connect animated exports and external encoder integration.
- [ ] Implement encryption/decryption, protection, document signature creation/verification and edit invalidation; cover sensitivity-label APIs without implying external policy enforcement.
- [ ] Complete BLOB/temp-file options, progress/warning callbacks, cancellation, external resource resolvers and memory-sensitive operations.
- [ ] Complete convenience APIs, web resource/template controls, and AI translation/generation through provider adapters. Test AI orchestration with deterministic fake providers; identical generative output is not a parity requirement. [SlidesAIAgent](https://reference.aspose.com/slides/java/com.aspose.slides/slidesaiagent/)
- [ ] Close overload/default/error/null/collection/lifetime differences and all remaining retained member mappings; report exclusions separately.

**Exit:** Observable behavior and supported feature combinations have tests; frames and time-dependent outputs match the declared reference subset; provider-dependent behavior has explicit contracts and failure tests.

### Phase 9 — Conformance, performance, and release

- [ ] Run the full corpus on the chosen supported OS/architecture/runtime matrix with pinned font packs.
- [ ] Close family-level visual and semantic regressions, repair-on-open defects, data loss, leaks and concurrency failures.
- [ ] Publish versioned API mappings, directional format support, compatibility reports, known differences and migration examples.
- [ ] Benchmark cold/warm load/edit/save/render/convert paths, peak memory, temporary storage and concurrent independent documents. Set release budgets from Phase 0/early-phase measurements, then enforce them in CI.
- [ ] Establish the process for future Aspose versions: inventory diff, new fixtures, implementation backlog and explicit target-version updates.

**Exit:** Every retained ledger item is verified or has a reasoned `not-applicable` classification, and every exclusion has a published rationale and tested boundary. Claim compatibility for the named modern scope, never full Aspose 26.9 parity. Missing retained features still block completion of that scope.

## 7. Dependencies, parallel work, and capacity

The critical path is **reference harness → package fidelity → document model/style resolution → text/geometry layout → complex-object layout → rendering/export conformance**. Some tracks overlap:

- After Phase 1, codec engineers can begin retained ODF/XML/PDF/HTML import work while the core team builds Phase 2; no binary PowerPoint workstream is required.
- After Phase 2 contracts stabilize, text/rendering and table/chart work can progress together. SmartArt/math need the same geometry and font foundations.
- Security/extension preservation can start early; signature correctness must follow final package-save behavior.
- Animation serialization can precede playback. Animated outputs remain gated by scene and timeline correctness.
- The compatibility/fixtures track runs throughout; difficult features must not wait until the end for an oracle test.

Plan for sustained ownership of (1) API/OOXML, (2) typography/rendering, (3) charts/diagrams/math, (4) codecs/output/security, and (5) compatibility automation. These are responsibilities, not necessarily five separate hires. A small team should deliver them sequentially with correspondingly longer lead time.

Removing binary PowerPoint and SWF eliminates dedicated codecs and their conversion/test matrices, but typography, charts, SmartArt and rendering remain substantial work. This may still be a multi-quarter or multi-year program if those engines must be built largely from scratch. That is a planning risk assessment, not a measured estimate. Phase 0 should produce ranges for the retained workstreams after candidate scope decisions, prototypes, dependency choices and platform requirements. Re-estimate after the first text, chart, SmartArt and output gates; do not infer a percentage saving from API counts.

Useful release boundaries are: **PPTX package fidelity** (Phases 1–2), **common authoring plus initial rendering** (Phase 3), **complex content and primary exports** (Phases 4–6), then **the complete retained modern scope** (Phases 7–9 and remaining earlier gates). Each release must name its supported dimensions, exclusions and outstanding gaps.

## 8. Validation strategy

For each scenario, run the same initial fixture and operation sequence through the pinned Java reference and the C# implementation. Capture environment, options, outputs, warnings/errors and elapsed/peak resource usage. Cross-read outputs where possible: Aspose reads C# output and C# reads Aspose output. Add independent PowerPoint/other-reader checks for repair, editability and ambiguous reference behavior.

| Test layer | Comparison and release condition |
| --- | --- |
| API contract | Normalized semantic JSON, return values, effective styles, exceptions, ordering, callback behavior and lifecycle |
| Package structure | Schema validation plus relationship/content-type/ID checks; reject newly introduced dangling references and unintended orphan parts while retaining pre-existing unknown content in preservation scenarios |
| Preservation | Hash opaque binary payloads and compare unmodified XML semantically; verify unknown markup, alternate content, extensions and external relationships survive |
| Editing | Reopen and inspect actual editable structures, not only preview images; repeat edits/saves to expose stale caches and ID churn |
| Layout | Compare line breaks, run positions, shape/chart/table bounds and clipping with explicit per-feature tolerances |
| Visual output | Fixed fonts/locale/DPI/backends; pixel/perceptual comparisons, region-level diagnostics, and reviewed overlays |
| Output options | Inspect PDF text/fonts/links/tags, raster dimensions, SVG objects, resources, notes, slide order and format-specific settings |
| Animation | Compare selected timeline frames and event timing, then independently play generated outputs where applicable |
| Robustness/scale | Malformed/truncated packages, missing fonts/resources, encrypted files, large images/media/decks, cancellation, memory/temp cleanup and concurrent documents |
| Exclusion boundaries | Clear errors for excluded file formats; no-op/clone preservation of embedded legacy payloads; encrypted OOXML correctly distinguished from binary PPT; no silent loss in rendering or type conversion |

Comparison rules:

- Normalize ZIP timestamps, serialization ordering and equivalent relationship/part IDs through graph-aware mapping. Do not normalize away lost links, content, order, styles or meaningful XML changes.
- Require exact semantic equality for discrete values; use named tolerances for floating-point geometry. Establish visual thresholds by feature from repeated reference runs and independent review; do not hide failures behind one aggregate similarity score.
- Include Latin, Arabic/Hebrew, Indic, CJK, emoji, mixed direction, vertical text, font fallback, complex transforms, theme overrides, chart formulas, media, animations and unsupported-extension fixtures.
- Use mutation sequences and metamorphic checks: no-op save, repeated save, clone/delete/reorder, theme changes, merge/split and import/export/reimport. Avoid tests that merely reproduce implementation internals.
- Separate reference defects from implementation defects. Record deliberate deviations and their rationale; do not silently reproduce a reference bug or silently redefine parity.
- Keep a small deterministic pull-request suite, broader nightly family suites, and complete release conformance. Pin large corpus artifacts by checksum rather than bloating ordinary source changes.

Schema validation is necessary but not sufficient: it cannot prove visual fidelity or correct application behavior. The SDK provides structural validation of Open XML documents. [SDK validation scope](https://learn.microsoft.com/en-us/office/open-xml/about-the-open-xml-sdk)

## 9. First implementation backlog

Start with these reviewable changes, in order:

1. **Reference manifest, scope and inventories:** record 26.9 identity, applied exclusions and candidate decisions, documentation provenance, retained public surface and directional formats; initialize the compatibility ledger.
2. **Solution/library/test scaffold:** separate transport from document code, preserve current health endpoints, pin tooling, and add CI.
3. **Differential runner:** one blank presentation and one existing-deck roundtrip scenario, with normalized semantic/package reports and oracle licensing status.
4. **PPTX lifecycle:** create/open/save/dispose, properties and slide enumeration, opaque-content preservation, validation and failure handling.
5. **Slides and dependency graph:** add/remove/reorder and cross-document clone, including themes/layouts/media/notes and links.
6. **Effective styles plus text/image vertical slice:** create/edit/save/reopen a themed text-and-image slide, then measure and render it through the initial scene pipeline.
7. **Feasibility decisions:** review the early text/chart/SmartArt/PDF and retained-format prototypes and commit to engine boundaries and delivery estimates before scaling parallel work.

This order produces a measurable foundation for the retained modern presentation scope, with legacy exclusions and optional further reductions visible from the start.
