package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m2v extends b3 {
   private long n5;
   private boolean l6;
   private long k5;
   private boolean u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private List<g7> t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "text:outline-level",
      "text:restart-numbering",
      "text:start-value",
      "text:is-list-header",
      "text:style-name",
      "text:class-names",
      "text:cond-style-name",
      "text:id",
      "text:number",
      "text:s",
      "text:tab",
      "text:line-break",
      "text:soft-page-break",
      "text:span",
      "text:a",
      "text:bookmark",
      "text:bookmark-start",
      "text:bookmark-end",
      "text:reference-mark",
      "text:reference-mark-start",
      "text:reference-mark-end",
      "text:note",
      "text:ruby",
      "office:annotation",
      "text:change-marks",
      "draw:rect",
      "draw:line",
      "draw:polyline",
      "draw:polygon",
      "draw:regular-polygon",
      "draw:path",
      "draw:circle",
      "draw:ellipse",
      "draw:g",
      "draw:page-thumbnail",
      "draw:frame",
      "draw:measure",
      "draw:caption",
      "draw:connector",
      "draw:control",
      "dr3d:scene",
      "draw:custom-shape",
      "draw:a",
      "text:date",
      "text:time",
      "text:page-number",
      "text:page-continuation",
      "text:sender-firstname",
      "text:sender-lastname",
      "text:sender-initials",
      "text:sender-title",
      "text:sender-position",
      "text:sender-email",
      "text:sender-phone-private",
      "text:sender-fax",
      "text:sender-company",
      "text:sender-phone-work",
      "text:sender-street",
      "text:sender-city",
      "text:sender-postal-code",
      "text:sender-country",
      "text:sender-state-or-province",
      "text:author-name",
      "text:author-initials",
      "text:chapter",
      "text:file-name",
      "text:template-name",
      "text:sheet-name",
      "text:variable-set",
      "text:variable-get",
      "text:variable-input",
      "text:user-field-get",
      "text:user-field-input",
      "text:sequence",
      "text:expression",
      "text:text-input",
      "text:initial-creator",
      "text:creation-date",
      "text:creation-time",
      "text:description",
      "text:user-defined",
      "text:print-time",
      "text:print-date",
      "text:printed-by",
      "text:title",
      "text:subject",
      "text:keywords",
      "text:editing-cycles",
      "text:editing-duration",
      "text:modification-time",
      "text:modification-date",
      "text:creator",
      "text:page-count",
      "text:paragraph-count",
      "text:word-count",
      "text:character-count",
      "text:table-count",
      "text:image-count",
      "text:object-count",
      "text:database-display",
      "text:database-next",
      "text:database-row-select",
      "text:database-row-number",
      "text:database-name",
      "text:page-variable-set",
      "text:page-variable-get",
      "text:placeholder",
      "text:conditional-text",
      "text:hidden-text",
      "text:reference-ref",
      "text:bookmark-ref",
      "text:note-ref",
      "text:sequence-ref",
      "text:script",
      "text:execute-macro",
      "text:hidden-paragraph",
      "text:dde-connection",
      "text:measure",
      "text:table-formula",
      "text:toc-mark-start",
      "text:toc-mark-end",
      "text:toc-mark",
      "text:user-index-mark-start",
      "text:user-index-mark-end",
      "text:user-index-mark",
      "text:alphabetical-index-mark-start",
      "text:alphabetical-index-mark-end",
      "text:alphabetical-index-mark",
      "text:bibliography-mark",
      "presentation:header",
      "presentation:footer",
      "presentation:date-time",
      "_TEXT"
   );

   public m2v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m2v$1 var2 = new m2v$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (s7.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 8:
                     var1.u9();
                     String var129 = var1.z1();
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "number"}), var129));
                     break;
                  case 9:
                     h3w var6 = new h3w(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "s"}), var6));
                     break;
                  case 10:
                     q3x var7 = new q3x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "tab"}), var7));
                     break;
                  case 11:
                     b5t var8 = new b5t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "line-break"}), var8));
                     break;
                  case 12:
                     j0v var9 = new j0v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "soft-page-break"}), var9));
                     break;
                  case 13:
                     w5k var10 = new w5k(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "span"}), var10));
                     break;
                  case 14:
                     t6t var11 = new t6t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "a"}), var11));
                     break;
                  case 15:
                     a9x var12 = new a9x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark"}), var12));
                     break;
                  case 16:
                     k1z var13 = new k1z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-start"}), var13));
                     break;
                  case 17:
                     v5s var14 = new v5s(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-end"}), var14));
                     break;
                  case 18:
                     u7j var15 = new u7j(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark"}), var15));
                     break;
                  case 19:
                     c2e var16 = new c2e(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-start"}), var16));
                     break;
                  case 20:
                     l5b var17 = new l5b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-end"}), var17));
                     break;
                  case 21:
                     r9g var18 = new r9g(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note"}), var18));
                     break;
                  case 22:
                     k1s var19 = new k1s(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "ruby"}), var19));
                     break;
                  case 23:
                     j8d var20 = new j8d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"office:", "annotation"}), var20));
                     break;
                  case 24:
                     t2s var21 = new t2s(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "change-marks"}), var21));
                     break;
                  case 25:
                     e6x var22 = new e6x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "rect"}), var22));
                     break;
                  case 26:
                     j6v var23 = new j6v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "line"}), var23));
                     break;
                  case 27:
                     u5l var24 = new u5l(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polyline"}), var24));
                     break;
                  case 28:
                     s4p var25 = new s4p(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polygon"}), var25));
                     break;
                  case 29:
                     z7d var26 = new z7d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "regular-polygon"}), var26));
                     break;
                  case 30:
                     c5w var27 = new c5w(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "path"}), var27));
                     break;
                  case 31:
                     f1h var28 = new f1h(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "circle"}), var28));
                     break;
                  case 32:
                     d2z var29 = new d2z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "ellipse"}), var29));
                     break;
                  case 33:
                     c4f var30 = new c4f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "g"}), var30));
                     break;
                  case 34:
                     h4i var31 = new h4i(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "page-thumbnail"}), var31));
                     break;
                  case 35:
                     b4f var32 = new b4f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "frame"}), var32));
                     break;
                  case 36:
                     v6z var33 = new v6z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "measure"}), var33));
                     break;
                  case 37:
                     v8v var34 = new v8v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "caption"}), var34));
                     break;
                  case 38:
                     l3d var35 = new l3d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "connector"}), var35));
                     break;
                  case 39:
                     w4a var36 = new w4a(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "control"}), var36));
                     break;
                  case 40:
                     d8f var37 = new d8f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"dr3d:", "scene"}), var37));
                     break;
                  case 41:
                     g3c var38 = new g3c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "custom-shape"}), var38));
                     break;
                  case 42:
                     y3o var39 = new y3o(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "a"}), var39));
                     break;
                  case 43:
                     p3f var40 = new p3f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "date"}), var40));
                     break;
                  case 44:
                     u3b var41 = new u3b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "time"}), var41));
                     break;
                  case 45:
                     y3t var42 = new y3t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-number"}), var42));
                     break;
                  case 46:
                     k2i var43 = new k2i(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-continuation"}), var43));
                     break;
                  case 47:
                     e2r var44 = new e2r(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-firstname"}), var44));
                     break;
                  case 48:
                     d3t var45 = new d3t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-lastname"}), var45));
                     break;
                  case 49:
                     q1k var46 = new q1k(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-initials"}), var46));
                     break;
                  case 50:
                     c1t var47 = new c1t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-title"}), var47));
                     break;
                  case 51:
                     h5p var48 = new h5p(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-position"}), var48));
                     break;
                  case 52:
                     c9e var49 = new c9e(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-email"}), var49));
                     break;
                  case 53:
                     m0t var50 = new m0t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-private"}), var50));
                     break;
                  case 54:
                     q2b var51 = new q2b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-fax"}), var51));
                     break;
                  case 55:
                     k4f var52 = new k4f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-company"}), var52));
                     break;
                  case 56:
                     s5l var53 = new s5l(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-work"}), var53));
                     break;
                  case 57:
                     h6n var54 = new h6n(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-street"}), var54));
                     break;
                  case 58:
                     i2u var55 = new i2u(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-city"}), var55));
                     break;
                  case 59:
                     x6u var56 = new x6u(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-postal-code"}), var56));
                     break;
                  case 60:
                     n9f var57 = new n9f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-country"}), var57));
                     break;
                  case 61:
                     b8o var58 = new b8o(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-state-or-province"}), var58));
                     break;
                  case 62:
                     l7d var59 = new l7d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-name"}), var59));
                     break;
                  case 63:
                     s6o var60 = new s6o(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-initials"}), var60));
                     break;
                  case 64:
                     y1x var61 = new y1x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "chapter"}), var61));
                     break;
                  case 65:
                     r2k var62 = new r2k(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "file-name"}), var62));
                     break;
                  case 66:
                     q2q var63 = new q2q(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "template-name"}), var63));
                     break;
                  case 67:
                     var1.u9();
                     String var64 = var1.z1();
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sheet-name"}), var64));
                     break;
                  case 68:
                     m7g var65 = new m7g(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-set"}), var65));
                     break;
                  case 69:
                     u9x var66 = new u9x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-get"}), var66));
                     break;
                  case 70:
                     e0p var67 = new e0p(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-input"}), var67));
                     break;
                  case 71:
                     e9g var68 = new e9g(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-get"}), var68));
                     break;
                  case 72:
                     p2f var69 = new p2f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-input"}), var69));
                     break;
                  case 73:
                     s5u var70 = new s5u(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence"}), var70));
                     break;
                  case 74:
                     q3f var71 = new q3f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "expression"}), var71));
                     break;
                  case 75:
                     e3a var72 = new e3a(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "text-input"}), var72));
                     break;
                  case 76:
                     n3v var73 = new n3v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "initial-creator"}), var73));
                     break;
                  case 77:
                     y5z var74 = new y5z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-date"}), var74));
                     break;
                  case 78:
                     q7n var75 = new q7n(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-time"}), var75));
                     break;
                  case 79:
                     n0r var76 = new n0r(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "description"}), var76));
                     break;
                  case 80:
                     q8c var77 = new q8c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-defined"}), var77));
                     break;
                  case 81:
                     q1l var78 = new q1l(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-time"}), var78));
                     break;
                  case 82:
                     c2l var79 = new c2l(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-date"}), var79));
                     break;
                  case 83:
                     z4n var80 = new z4n(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "printed-by"}), var80));
                     break;
                  case 84:
                     q4b var81 = new q4b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "title"}), var81));
                     break;
                  case 85:
                     y4f var82 = new y4f(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "subject"}), var82));
                     break;
                  case 86:
                     k6a var83 = new k6a(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "keywords"}), var83));
                     break;
                  case 87:
                     e6p var84 = new e6p(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-cycles"}), var84));
                     break;
                  case 88:
                     x4r var85 = new x4r(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-duration"}), var85));
                     break;
                  case 89:
                     d3p var86 = new d3p(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-time"}), var86));
                     break;
                  case 90:
                     k7n var87 = new k7n(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-date"}), var87));
                     break;
                  case 91:
                     x8t var88 = new x8t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creator"}), var88));
                     break;
                  case 92:
                     p1w var89 = new p1w(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-count"}), var89));
                     break;
                  case 93:
                     g4v var90 = new g4v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "paragraph-count"}), var90));
                     break;
                  case 94:
                     d4c var91 = new d4c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "word-count"}), var91));
                     break;
                  case 95:
                     b0t var92 = new b0t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "character-count"}), var92));
                     break;
                  case 96:
                     a5a var93 = new a5a(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-count"}), var93));
                     break;
                  case 97:
                     j2z var94 = new j2z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "image-count"}), var94));
                     break;
                  case 98:
                     x1z var95 = new x1z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "object-count"}), var95));
                     break;
                  case 99:
                     j5h var96 = new j5h(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-display"}), var96));
                     break;
                  case 100:
                     q8x var97 = new q8x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-next"}), var97));
                     break;
                  case 101:
                     l6k var98 = new l6k(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-select"}), var98));
                     break;
                  case 102:
                     f3z var99 = new f3z(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-number"}), var99));
                     break;
                  case 103:
                     n7r var100 = new n7r(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-name"}), var100));
                     break;
                  case 104:
                     q3b var101 = new q3b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-set"}), var101));
                     break;
                  case 105:
                     s2u var102 = new s2u(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-get"}), var102));
                     break;
                  case 106:
                     m7c var103 = new m7c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "placeholder"}), var103));
                     break;
                  case 107:
                     w2h var104 = new w2h(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "conditional-text"}), var104));
                     break;
                  case 108:
                     g6c var105 = new g6c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-text"}), var105));
                     break;
                  case 109:
                     g4x var106 = new g4x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-ref"}), var106));
                     break;
                  case 110:
                     g9d var107 = new g9d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-ref"}), var107));
                     break;
                  case 111:
                     n9g var108 = new n9g(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note-ref"}), var108));
                     break;
                  case 112:
                     y5x var109 = new y5x(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence-ref"}), var109));
                     break;
                  case 113:
                     k2q var110 = new k2q(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "script"}), var110));
                     break;
                  case 114:
                     t5w var111 = new t5w(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "execute-macro"}), var111));
                     break;
                  case 115:
                     x0q var112 = new x0q(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-paragraph"}), var112));
                     break;
                  case 116:
                     m2c var113 = new m2c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "dde-connection"}), var113));
                     break;
                  case 117:
                     d0v var114 = new d0v(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "measure"}), var114));
                     break;
                  case 118:
                     l9s var115 = new l9s(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-formula"}), var115));
                     break;
                  case 119:
                     g8t var116 = new g8t(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-start"}), var116));
                     break;
                  case 120:
                     w3n var117 = new w3n(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-end"}), var117));
                     break;
                  case 121:
                     i6d var118 = new i6d(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark"}), var118));
                     break;
                  case 122:
                     s6b var119 = new s6b(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-start"}), var119));
                     break;
                  case 123:
                     d5w var120 = new d5w(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-end"}), var120));
                     break;
                  case 124:
                     s6s var121 = new s6s(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark"}), var121));
                     break;
                  case 125:
                     e9j var122 = new e9j(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-start"}), var122));
                     break;
                  case 126:
                     l3c var123 = new l3c(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-end"}), var123));
                     break;
                  case 127:
                     u4e var124 = new u4e(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark"}), var124));
                     break;
                  case 128:
                     g6o var125 = new g6o(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bibliography-mark"}), var125));
                     break;
                  case 129:
                     o7y var126 = new o7y(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "header"}), var126));
                     break;
                  case 130:
                     k7u var127 = new k7u(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "footer"}), var127));
                     break;
                  case 131:
                     b3j var128 = new b3j(var1);
                     this.t2.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "date-time"}), var128));
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var5 = var1.z1();
               this.t2.addItem(new g7("_TEXT", var5));
            }
         }
      }
   }

   public m2v() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = 4294967295L;
      this.u3 = false;
      this.t2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:outline-level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6) {
         var2.l6("text:restart-numbering", this.l6 ? "true" : "false");
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("text:start-value", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3) {
         var2.l6("text:is-list-header", this.u3 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("text:style-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("text:class-names", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("text:cond-style-name", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("text:id", this.c8);
      }

      List$Enumerator var4 = this.t2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (s7.n5(var5.n5())) {
               case 8:
                  this.n5("text", var2, "number", (String)var5.k5(), false);
                  break;
               case 9:
                  ((h3w)var5.k5()).n5("text", var2, "s");
                  break;
               case 10:
                  ((q3x)var5.k5()).n5("text", var2, "tab");
                  break;
               case 11:
                  ((b5t)var5.k5()).n5("text", var2, "line-break");
                  break;
               case 12:
                  ((j0v)var5.k5()).n5("text", var2, "soft-page-break");
                  break;
               case 13:
                  ((w5k)var5.k5()).n5("text", var2, "span");
                  break;
               case 14:
                  ((t6t)var5.k5()).n5("text", var2, "a");
                  break;
               case 15:
                  ((a9x)var5.k5()).n5("text", var2, "bookmark");
                  break;
               case 16:
                  ((k1z)var5.k5()).n5("text", var2, "bookmark-start");
                  break;
               case 17:
                  ((v5s)var5.k5()).n5("text", var2, "bookmark-end");
                  break;
               case 18:
                  ((u7j)var5.k5()).n5("text", var2, "reference-mark");
                  break;
               case 19:
                  ((c2e)var5.k5()).n5("text", var2, "reference-mark-start");
                  break;
               case 20:
                  ((l5b)var5.k5()).n5("text", var2, "reference-mark-end");
                  break;
               case 21:
                  ((r9g)var5.k5()).n5("text", var2, "note");
                  break;
               case 22:
                  ((k1s)var5.k5()).n5("text", var2, "ruby");
                  break;
               case 23:
                  ((j8d)var5.k5()).n5("office", var2, "annotation");
                  break;
               case 24:
                  ((t2s)var5.k5()).n5("text", var2, "change-marks");
                  break;
               case 25:
                  ((e6x)var5.k5()).n5("draw", var2, "rect");
                  break;
               case 26:
                  ((j6v)var5.k5()).n5("draw", var2, "line");
                  break;
               case 27:
                  ((u5l)var5.k5()).n5("draw", var2, "polyline");
                  break;
               case 28:
                  ((s4p)var5.k5()).n5("draw", var2, "polygon");
                  break;
               case 29:
                  ((z7d)var5.k5()).n5("draw", var2, "regular-polygon");
                  break;
               case 30:
                  ((c5w)var5.k5()).n5("draw", var2, "path");
                  break;
               case 31:
                  ((f1h)var5.k5()).n5("draw", var2, "circle");
                  break;
               case 32:
                  ((d2z)var5.k5()).n5("draw", var2, "ellipse");
                  break;
               case 33:
                  ((c4f)var5.k5()).n5("draw", var2, "g");
                  break;
               case 34:
                  ((h4i)var5.k5()).n5("draw", var2, "page-thumbnail");
                  break;
               case 35:
                  ((b4f)var5.k5()).n5("draw", var2, "frame");
                  break;
               case 36:
                  ((v6z)var5.k5()).n5("draw", var2, "measure");
                  break;
               case 37:
                  ((v8v)var5.k5()).n5("draw", var2, "caption");
                  break;
               case 38:
                  ((l3d)var5.k5()).n5("draw", var2, "connector");
                  break;
               case 39:
                  ((w4a)var5.k5()).n5("draw", var2, "control");
                  break;
               case 40:
                  ((d8f)var5.k5()).n5("dr3d", var2, "scene");
                  break;
               case 41:
                  ((g3c)var5.k5()).n5("draw", var2, "custom-shape");
                  break;
               case 42:
                  ((y3o)var5.k5()).n5("draw", var2, "a");
                  break;
               case 43:
                  ((p3f)var5.k5()).n5("text", var2, "date");
                  break;
               case 44:
                  ((u3b)var5.k5()).n5("text", var2, "time");
                  break;
               case 45:
                  ((y3t)var5.k5()).n5("text", var2, "page-number");
                  break;
               case 46:
                  ((k2i)var5.k5()).n5("text", var2, "page-continuation");
                  break;
               case 47:
                  ((e2r)var5.k5()).n5("text", var2, "sender-firstname");
                  break;
               case 48:
                  ((d3t)var5.k5()).n5("text", var2, "sender-lastname");
                  break;
               case 49:
                  ((q1k)var5.k5()).n5("text", var2, "sender-initials");
                  break;
               case 50:
                  ((c1t)var5.k5()).n5("text", var2, "sender-title");
                  break;
               case 51:
                  ((h5p)var5.k5()).n5("text", var2, "sender-position");
                  break;
               case 52:
                  ((c9e)var5.k5()).n5("text", var2, "sender-email");
                  break;
               case 53:
                  ((m0t)var5.k5()).n5("text", var2, "sender-phone-private");
                  break;
               case 54:
                  ((q2b)var5.k5()).n5("text", var2, "sender-fax");
                  break;
               case 55:
                  ((k4f)var5.k5()).n5("text", var2, "sender-company");
                  break;
               case 56:
                  ((s5l)var5.k5()).n5("text", var2, "sender-phone-work");
                  break;
               case 57:
                  ((h6n)var5.k5()).n5("text", var2, "sender-street");
                  break;
               case 58:
                  ((i2u)var5.k5()).n5("text", var2, "sender-city");
                  break;
               case 59:
                  ((x6u)var5.k5()).n5("text", var2, "sender-postal-code");
                  break;
               case 60:
                  ((n9f)var5.k5()).n5("text", var2, "sender-country");
                  break;
               case 61:
                  ((b8o)var5.k5()).n5("text", var2, "sender-state-or-province");
                  break;
               case 62:
                  ((l7d)var5.k5()).n5("text", var2, "author-name");
                  break;
               case 63:
                  ((s6o)var5.k5()).n5("text", var2, "author-initials");
                  break;
               case 64:
                  ((y1x)var5.k5()).n5("text", var2, "chapter");
                  break;
               case 65:
                  ((r2k)var5.k5()).n5("text", var2, "file-name");
                  break;
               case 66:
                  ((q2q)var5.k5()).n5("text", var2, "template-name");
                  break;
               case 67:
                  this.n5("text", var2, "sheet-name", (String)var5.k5(), false);
                  break;
               case 68:
                  ((m7g)var5.k5()).n5("text", var2, "variable-set");
                  break;
               case 69:
                  ((u9x)var5.k5()).n5("text", var2, "variable-get");
                  break;
               case 70:
                  ((e0p)var5.k5()).n5("text", var2, "variable-input");
                  break;
               case 71:
                  ((e9g)var5.k5()).n5("text", var2, "user-field-get");
                  break;
               case 72:
                  ((p2f)var5.k5()).n5("text", var2, "user-field-input");
                  break;
               case 73:
                  ((s5u)var5.k5()).n5("text", var2, "sequence");
                  break;
               case 74:
                  ((q3f)var5.k5()).n5("text", var2, "expression");
                  break;
               case 75:
                  ((e3a)var5.k5()).n5("text", var2, "text-input");
                  break;
               case 76:
                  ((n3v)var5.k5()).n5("text", var2, "initial-creator");
                  break;
               case 77:
                  ((y5z)var5.k5()).n5("text", var2, "creation-date");
                  break;
               case 78:
                  ((q7n)var5.k5()).n5("text", var2, "creation-time");
                  break;
               case 79:
                  ((n0r)var5.k5()).n5("text", var2, "description");
                  break;
               case 80:
                  ((q8c)var5.k5()).n5("text", var2, "user-defined");
                  break;
               case 81:
                  ((q1l)var5.k5()).n5("text", var2, "print-time");
                  break;
               case 82:
                  ((c2l)var5.k5()).n5("text", var2, "print-date");
                  break;
               case 83:
                  ((z4n)var5.k5()).n5("text", var2, "printed-by");
                  break;
               case 84:
                  ((q4b)var5.k5()).n5("text", var2, "title");
                  break;
               case 85:
                  ((y4f)var5.k5()).n5("text", var2, "subject");
                  break;
               case 86:
                  ((k6a)var5.k5()).n5("text", var2, "keywords");
                  break;
               case 87:
                  ((e6p)var5.k5()).n5("text", var2, "editing-cycles");
                  break;
               case 88:
                  ((x4r)var5.k5()).n5("text", var2, "editing-duration");
                  break;
               case 89:
                  ((d3p)var5.k5()).n5("text", var2, "modification-time");
                  break;
               case 90:
                  ((k7n)var5.k5()).n5("text", var2, "modification-date");
                  break;
               case 91:
                  ((x8t)var5.k5()).n5("text", var2, "creator");
                  break;
               case 92:
                  ((p1w)var5.k5()).n5("text", var2, "page-count");
                  break;
               case 93:
                  ((g4v)var5.k5()).n5("text", var2, "paragraph-count");
                  break;
               case 94:
                  ((d4c)var5.k5()).n5("text", var2, "word-count");
                  break;
               case 95:
                  ((b0t)var5.k5()).n5("text", var2, "character-count");
                  break;
               case 96:
                  ((a5a)var5.k5()).n5("text", var2, "table-count");
                  break;
               case 97:
                  ((j2z)var5.k5()).n5("text", var2, "image-count");
                  break;
               case 98:
                  ((x1z)var5.k5()).n5("text", var2, "object-count");
                  break;
               case 99:
                  ((j5h)var5.k5()).n5("text", var2, "database-display");
                  break;
               case 100:
                  ((q8x)var5.k5()).n5("text", var2, "database-next");
                  break;
               case 101:
                  ((l6k)var5.k5()).n5("text", var2, "database-row-select");
                  break;
               case 102:
                  ((f3z)var5.k5()).n5("text", var2, "database-row-number");
                  break;
               case 103:
                  ((n7r)var5.k5()).n5("text", var2, "database-name");
                  break;
               case 104:
                  ((q3b)var5.k5()).n5("text", var2, "page-variable-set");
                  break;
               case 105:
                  ((s2u)var5.k5()).n5("text", var2, "page-variable-get");
                  break;
               case 106:
                  ((m7c)var5.k5()).n5("text", var2, "placeholder");
                  break;
               case 107:
                  ((w2h)var5.k5()).n5("text", var2, "conditional-text");
                  break;
               case 108:
                  ((g6c)var5.k5()).n5("text", var2, "hidden-text");
                  break;
               case 109:
                  ((g4x)var5.k5()).n5("text", var2, "reference-ref");
                  break;
               case 110:
                  ((g9d)var5.k5()).n5("text", var2, "bookmark-ref");
                  break;
               case 111:
                  ((n9g)var5.k5()).n5("text", var2, "note-ref");
                  break;
               case 112:
                  ((y5x)var5.k5()).n5("text", var2, "sequence-ref");
                  break;
               case 113:
                  ((k2q)var5.k5()).n5("text", var2, "script");
                  break;
               case 114:
                  ((t5w)var5.k5()).n5("text", var2, "execute-macro");
                  break;
               case 115:
                  ((x0q)var5.k5()).n5("text", var2, "hidden-paragraph");
                  break;
               case 116:
                  ((m2c)var5.k5()).n5("text", var2, "dde-connection");
                  break;
               case 117:
                  ((d0v)var5.k5()).n5("text", var2, "measure");
                  break;
               case 118:
                  ((l9s)var5.k5()).n5("text", var2, "table-formula");
                  break;
               case 119:
                  ((g8t)var5.k5()).n5("text", var2, "toc-mark-start");
                  break;
               case 120:
                  ((w3n)var5.k5()).n5("text", var2, "toc-mark-end");
                  break;
               case 121:
                  ((i6d)var5.k5()).n5("text", var2, "toc-mark");
                  break;
               case 122:
                  ((s6b)var5.k5()).n5("text", var2, "user-index-mark-start");
                  break;
               case 123:
                  ((d5w)var5.k5()).n5("text", var2, "user-index-mark-end");
                  break;
               case 124:
                  ((s6s)var5.k5()).n5("text", var2, "user-index-mark");
                  break;
               case 125:
                  ((e9j)var5.k5()).n5("text", var2, "alphabetical-index-mark-start");
                  break;
               case 126:
                  ((l3c)var5.k5()).n5("text", var2, "alphabetical-index-mark-end");
                  break;
               case 127:
                  ((u4e)var5.k5()).n5("text", var2, "alphabetical-index-mark");
                  break;
               case 128:
                  ((g6o)var5.k5()).n5("text", var2, "bibliography-mark");
                  break;
               case 129:
                  ((o7y)var5.k5()).n5("presentation", var2, "header");
                  break;
               case 130:
                  ((k7u)var5.k5()).n5("presentation", var2, "footer");
                  break;
               case 131:
                  ((b3j)var5.k5()).n5("presentation", var2, "date-time");
                  break;
               case 132:
                  var2.l6((String)var5.k5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static long n5(m2v var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m2v var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(m2v var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m2v var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(m2v var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(m2v var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(m2v var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(m2v var0, String var1) {
      return var0.c8 = var1;
   }
}
