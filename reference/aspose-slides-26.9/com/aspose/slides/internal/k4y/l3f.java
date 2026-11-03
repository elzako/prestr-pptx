package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l3f extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
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

   public l3f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n5();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 0:
                     h3w var127 = new h3w(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "s"}), var127));
                     break;
                  case 1:
                     q3x var5 = new q3x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "tab"}), var5));
                     break;
                  case 2:
                     b5t var6 = new b5t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "line-break"}), var6));
                     break;
                  case 3:
                     j0v var7 = new j0v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "soft-page-break"}), var7));
                     break;
                  case 4:
                     w5k var8 = new w5k(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "span"}), var8));
                     break;
                  case 5:
                     t6t var9 = new t6t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "a"}), var9));
                     break;
                  case 6:
                     a9x var10 = new a9x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark"}), var10));
                     break;
                  case 7:
                     k1z var11 = new k1z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-start"}), var11));
                     break;
                  case 8:
                     v5s var12 = new v5s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-end"}), var12));
                     break;
                  case 9:
                     u7j var13 = new u7j(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark"}), var13));
                     break;
                  case 10:
                     c2e var14 = new c2e(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-start"}), var14));
                     break;
                  case 11:
                     l5b var15 = new l5b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-end"}), var15));
                     break;
                  case 12:
                     r9g var16 = new r9g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note"}), var16));
                     break;
                  case 13:
                     k1s var17 = new k1s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "ruby"}), var17));
                     break;
                  case 14:
                     j8d var18 = new j8d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"office:", "annotation"}), var18));
                     break;
                  case 15:
                     t2s var19 = new t2s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "change-marks"}), var19));
                     break;
                  case 16:
                     e6x var20 = new e6x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "rect"}), var20));
                     break;
                  case 17:
                     j6v var21 = new j6v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "line"}), var21));
                     break;
                  case 18:
                     u5l var22 = new u5l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polyline"}), var22));
                     break;
                  case 19:
                     s4p var23 = new s4p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polygon"}), var23));
                     break;
                  case 20:
                     z7d var24 = new z7d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "regular-polygon"}), var24));
                     break;
                  case 21:
                     c5w var25 = new c5w(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "path"}), var25));
                     break;
                  case 22:
                     f1h var26 = new f1h(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "circle"}), var26));
                     break;
                  case 23:
                     d2z var27 = new d2z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "ellipse"}), var27));
                     break;
                  case 24:
                     c4f var28 = new c4f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "g"}), var28));
                     break;
                  case 25:
                     h4i var29 = new h4i(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "page-thumbnail"}), var29));
                     break;
                  case 26:
                     b4f var30 = new b4f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "frame"}), var30));
                     break;
                  case 27:
                     v6z var31 = new v6z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "measure"}), var31));
                     break;
                  case 28:
                     v8v var32 = new v8v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "caption"}), var32));
                     break;
                  case 29:
                     l3d var33 = new l3d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "connector"}), var33));
                     break;
                  case 30:
                     w4a var34 = new w4a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "control"}), var34));
                     break;
                  case 31:
                     d8f var35 = new d8f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"dr3d:", "scene"}), var35));
                     break;
                  case 32:
                     g3c var36 = new g3c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "custom-shape"}), var36));
                     break;
                  case 33:
                     y3o var37 = new y3o(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "a"}), var37));
                     break;
                  case 34:
                     p3f var38 = new p3f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "date"}), var38));
                     break;
                  case 35:
                     u3b var39 = new u3b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "time"}), var39));
                     break;
                  case 36:
                     y3t var40 = new y3t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-number"}), var40));
                     break;
                  case 37:
                     k2i var41 = new k2i(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-continuation"}), var41));
                     break;
                  case 38:
                     e2r var42 = new e2r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-firstname"}), var42));
                     break;
                  case 39:
                     d3t var43 = new d3t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-lastname"}), var43));
                     break;
                  case 40:
                     q1k var44 = new q1k(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-initials"}), var44));
                     break;
                  case 41:
                     c1t var45 = new c1t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-title"}), var45));
                     break;
                  case 42:
                     h5p var46 = new h5p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-position"}), var46));
                     break;
                  case 43:
                     c9e var47 = new c9e(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-email"}), var47));
                     break;
                  case 44:
                     m0t var48 = new m0t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-private"}), var48));
                     break;
                  case 45:
                     q2b var49 = new q2b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-fax"}), var49));
                     break;
                  case 46:
                     k4f var50 = new k4f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-company"}), var50));
                     break;
                  case 47:
                     s5l var51 = new s5l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-work"}), var51));
                     break;
                  case 48:
                     h6n var52 = new h6n(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-street"}), var52));
                     break;
                  case 49:
                     i2u var53 = new i2u(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-city"}), var53));
                     break;
                  case 50:
                     x6u var54 = new x6u(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-postal-code"}), var54));
                     break;
                  case 51:
                     n9f var55 = new n9f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-country"}), var55));
                     break;
                  case 52:
                     b8o var56 = new b8o(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-state-or-province"}), var56));
                     break;
                  case 53:
                     l7d var57 = new l7d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-name"}), var57));
                     break;
                  case 54:
                     s6o var58 = new s6o(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-initials"}), var58));
                     break;
                  case 55:
                     y1x var59 = new y1x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "chapter"}), var59));
                     break;
                  case 56:
                     r2k var60 = new r2k(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "file-name"}), var60));
                     break;
                  case 57:
                     q2q var61 = new q2q(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "template-name"}), var61));
                     break;
                  case 58:
                     var1.u9();
                     String var62 = var1.z1();
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sheet-name"}), var62));
                     break;
                  case 59:
                     m7g var63 = new m7g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-set"}), var63));
                     break;
                  case 60:
                     u9x var64 = new u9x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-get"}), var64));
                     break;
                  case 61:
                     e0p var65 = new e0p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-input"}), var65));
                     break;
                  case 62:
                     e9g var66 = new e9g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-get"}), var66));
                     break;
                  case 63:
                     p2f var67 = new p2f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-input"}), var67));
                     break;
                  case 64:
                     s5u var68 = new s5u(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence"}), var68));
                     break;
                  case 65:
                     q3f var69 = new q3f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "expression"}), var69));
                     break;
                  case 66:
                     e3a var70 = new e3a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "text-input"}), var70));
                     break;
                  case 67:
                     n3v var71 = new n3v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "initial-creator"}), var71));
                     break;
                  case 68:
                     y5z var72 = new y5z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-date"}), var72));
                     break;
                  case 69:
                     q7n var73 = new q7n(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-time"}), var73));
                     break;
                  case 70:
                     n0r var74 = new n0r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "description"}), var74));
                     break;
                  case 71:
                     q8c var75 = new q8c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-defined"}), var75));
                     break;
                  case 72:
                     q1l var76 = new q1l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-time"}), var76));
                     break;
                  case 73:
                     c2l var77 = new c2l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-date"}), var77));
                     break;
                  case 74:
                     z4n var78 = new z4n(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "printed-by"}), var78));
                     break;
                  case 75:
                     q4b var79 = new q4b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "title"}), var79));
                     break;
                  case 76:
                     y4f var80 = new y4f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "subject"}), var80));
                     break;
                  case 77:
                     k6a var81 = new k6a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "keywords"}), var81));
                     break;
                  case 78:
                     e6p var82 = new e6p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-cycles"}), var82));
                     break;
                  case 79:
                     x4r var83 = new x4r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-duration"}), var83));
                     break;
                  case 80:
                     d3p var84 = new d3p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-time"}), var84));
                     break;
                  case 81:
                     k7n var85 = new k7n(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-date"}), var85));
                     break;
                  case 82:
                     x8t var86 = new x8t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creator"}), var86));
                     break;
                  case 83:
                     p1w var87 = new p1w(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-count"}), var87));
                     break;
                  case 84:
                     g4v var88 = new g4v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "paragraph-count"}), var88));
                     break;
                  case 85:
                     d4c var89 = new d4c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "word-count"}), var89));
                     break;
                  case 86:
                     b0t var90 = new b0t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "character-count"}), var90));
                     break;
                  case 87:
                     a5a var91 = new a5a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-count"}), var91));
                     break;
                  case 88:
                     j2z var92 = new j2z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "image-count"}), var92));
                     break;
                  case 89:
                     x1z var93 = new x1z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "object-count"}), var93));
                     break;
                  case 90:
                     j5h var94 = new j5h(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-display"}), var94));
                     break;
                  case 91:
                     q8x var95 = new q8x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-next"}), var95));
                     break;
                  case 92:
                     l6k var96 = new l6k(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-select"}), var96));
                     break;
                  case 93:
                     f3z var97 = new f3z(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-number"}), var97));
                     break;
                  case 94:
                     n7r var98 = new n7r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-name"}), var98));
                     break;
                  case 95:
                     q3b var99 = new q3b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-set"}), var99));
                     break;
                  case 96:
                     s2u var100 = new s2u(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-get"}), var100));
                     break;
                  case 97:
                     m7c var101 = new m7c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "placeholder"}), var101));
                     break;
                  case 98:
                     w2h var102 = new w2h(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "conditional-text"}), var102));
                     break;
                  case 99:
                     g6c var103 = new g6c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-text"}), var103));
                     break;
                  case 100:
                     g4x var104 = new g4x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-ref"}), var104));
                     break;
                  case 101:
                     g9d var105 = new g9d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-ref"}), var105));
                     break;
                  case 102:
                     n9g var106 = new n9g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note-ref"}), var106));
                     break;
                  case 103:
                     y5x var107 = new y5x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence-ref"}), var107));
                     break;
                  case 104:
                     k2q var108 = new k2q(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "script"}), var108));
                     break;
                  case 105:
                     t5w var109 = new t5w(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "execute-macro"}), var109));
                     break;
                  case 106:
                     x0q var110 = new x0q(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-paragraph"}), var110));
                     break;
                  case 107:
                     m2c var111 = new m2c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "dde-connection"}), var111));
                     break;
                  case 108:
                     d0v var112 = new d0v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "measure"}), var112));
                     break;
                  case 109:
                     l9s var113 = new l9s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-formula"}), var113));
                     break;
                  case 110:
                     g8t var114 = new g8t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-start"}), var114));
                     break;
                  case 111:
                     w3n var115 = new w3n(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-end"}), var115));
                     break;
                  case 112:
                     i6d var116 = new i6d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark"}), var116));
                     break;
                  case 113:
                     s6b var117 = new s6b(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-start"}), var117));
                     break;
                  case 114:
                     d5w var118 = new d5w(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-end"}), var118));
                     break;
                  case 115:
                     s6s var119 = new s6s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark"}), var119));
                     break;
                  case 116:
                     e9j var120 = new e9j(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-start"}), var120));
                     break;
                  case 117:
                     l3c var121 = new l3c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-end"}), var121));
                     break;
                  case 118:
                     u4e var122 = new u4e(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark"}), var122));
                     break;
                  case 119:
                     g6o var123 = new g6o(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bibliography-mark"}), var123));
                     break;
                  case 120:
                     o7y var124 = new o7y(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "header"}), var124));
                     break;
                  case 121:
                     k7u var125 = new k7u(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "footer"}), var125));
                     break;
                  case 122:
                     b3j var126 = new b3j(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "date-time"}), var126));
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var4 = var1.z1();
               this.n5.addItem(new g7("_TEXT", var4));
            }
         }
      }
   }

   public l3f() {
      this.n5();
   }

   private void n5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((h3w)var5.k5()).n5("text", var2, "s");
                  break;
               case 1:
                  ((q3x)var5.k5()).n5("text", var2, "tab");
                  break;
               case 2:
                  ((b5t)var5.k5()).n5("text", var2, "line-break");
                  break;
               case 3:
                  ((j0v)var5.k5()).n5("text", var2, "soft-page-break");
                  break;
               case 4:
                  ((w5k)var5.k5()).n5("text", var2, "span");
                  break;
               case 5:
                  ((t6t)var5.k5()).n5("text", var2, "a");
                  break;
               case 6:
                  ((a9x)var5.k5()).n5("text", var2, "bookmark");
                  break;
               case 7:
                  ((k1z)var5.k5()).n5("text", var2, "bookmark-start");
                  break;
               case 8:
                  ((v5s)var5.k5()).n5("text", var2, "bookmark-end");
                  break;
               case 9:
                  ((u7j)var5.k5()).n5("text", var2, "reference-mark");
                  break;
               case 10:
                  ((c2e)var5.k5()).n5("text", var2, "reference-mark-start");
                  break;
               case 11:
                  ((l5b)var5.k5()).n5("text", var2, "reference-mark-end");
                  break;
               case 12:
                  ((r9g)var5.k5()).n5("text", var2, "note");
                  break;
               case 13:
                  ((k1s)var5.k5()).n5("text", var2, "ruby");
                  break;
               case 14:
                  ((j8d)var5.k5()).n5("office", var2, "annotation");
                  break;
               case 15:
                  ((t2s)var5.k5()).n5("text", var2, "change-marks");
                  break;
               case 16:
                  ((e6x)var5.k5()).n5("draw", var2, "rect");
                  break;
               case 17:
                  ((j6v)var5.k5()).n5("draw", var2, "line");
                  break;
               case 18:
                  ((u5l)var5.k5()).n5("draw", var2, "polyline");
                  break;
               case 19:
                  ((s4p)var5.k5()).n5("draw", var2, "polygon");
                  break;
               case 20:
                  ((z7d)var5.k5()).n5("draw", var2, "regular-polygon");
                  break;
               case 21:
                  ((c5w)var5.k5()).n5("draw", var2, "path");
                  break;
               case 22:
                  ((f1h)var5.k5()).n5("draw", var2, "circle");
                  break;
               case 23:
                  ((d2z)var5.k5()).n5("draw", var2, "ellipse");
                  break;
               case 24:
                  ((c4f)var5.k5()).n5("draw", var2, "g");
                  break;
               case 25:
                  ((h4i)var5.k5()).n5("draw", var2, "page-thumbnail");
                  break;
               case 26:
                  ((b4f)var5.k5()).n5("draw", var2, "frame");
                  break;
               case 27:
                  ((v6z)var5.k5()).n5("draw", var2, "measure");
                  break;
               case 28:
                  ((v8v)var5.k5()).n5("draw", var2, "caption");
                  break;
               case 29:
                  ((l3d)var5.k5()).n5("draw", var2, "connector");
                  break;
               case 30:
                  ((w4a)var5.k5()).n5("draw", var2, "control");
                  break;
               case 31:
                  ((d8f)var5.k5()).n5("dr3d", var2, "scene");
                  break;
               case 32:
                  ((g3c)var5.k5()).n5("draw", var2, "custom-shape");
                  break;
               case 33:
                  ((y3o)var5.k5()).n5("draw", var2, "a");
                  break;
               case 34:
                  ((p3f)var5.k5()).n5("text", var2, "date");
                  break;
               case 35:
                  ((u3b)var5.k5()).n5("text", var2, "time");
                  break;
               case 36:
                  ((y3t)var5.k5()).n5("text", var2, "page-number");
                  break;
               case 37:
                  ((k2i)var5.k5()).n5("text", var2, "page-continuation");
                  break;
               case 38:
                  ((e2r)var5.k5()).n5("text", var2, "sender-firstname");
                  break;
               case 39:
                  ((d3t)var5.k5()).n5("text", var2, "sender-lastname");
                  break;
               case 40:
                  ((q1k)var5.k5()).n5("text", var2, "sender-initials");
                  break;
               case 41:
                  ((c1t)var5.k5()).n5("text", var2, "sender-title");
                  break;
               case 42:
                  ((h5p)var5.k5()).n5("text", var2, "sender-position");
                  break;
               case 43:
                  ((c9e)var5.k5()).n5("text", var2, "sender-email");
                  break;
               case 44:
                  ((m0t)var5.k5()).n5("text", var2, "sender-phone-private");
                  break;
               case 45:
                  ((q2b)var5.k5()).n5("text", var2, "sender-fax");
                  break;
               case 46:
                  ((k4f)var5.k5()).n5("text", var2, "sender-company");
                  break;
               case 47:
                  ((s5l)var5.k5()).n5("text", var2, "sender-phone-work");
                  break;
               case 48:
                  ((h6n)var5.k5()).n5("text", var2, "sender-street");
                  break;
               case 49:
                  ((i2u)var5.k5()).n5("text", var2, "sender-city");
                  break;
               case 50:
                  ((x6u)var5.k5()).n5("text", var2, "sender-postal-code");
                  break;
               case 51:
                  ((n9f)var5.k5()).n5("text", var2, "sender-country");
                  break;
               case 52:
                  ((b8o)var5.k5()).n5("text", var2, "sender-state-or-province");
                  break;
               case 53:
                  ((l7d)var5.k5()).n5("text", var2, "author-name");
                  break;
               case 54:
                  ((s6o)var5.k5()).n5("text", var2, "author-initials");
                  break;
               case 55:
                  ((y1x)var5.k5()).n5("text", var2, "chapter");
                  break;
               case 56:
                  ((r2k)var5.k5()).n5("text", var2, "file-name");
                  break;
               case 57:
                  ((q2q)var5.k5()).n5("text", var2, "template-name");
                  break;
               case 58:
                  this.n5("text", var2, "sheet-name", (String)var5.k5(), false);
                  break;
               case 59:
                  ((m7g)var5.k5()).n5("text", var2, "variable-set");
                  break;
               case 60:
                  ((u9x)var5.k5()).n5("text", var2, "variable-get");
                  break;
               case 61:
                  ((e0p)var5.k5()).n5("text", var2, "variable-input");
                  break;
               case 62:
                  ((e9g)var5.k5()).n5("text", var2, "user-field-get");
                  break;
               case 63:
                  ((p2f)var5.k5()).n5("text", var2, "user-field-input");
                  break;
               case 64:
                  ((s5u)var5.k5()).n5("text", var2, "sequence");
                  break;
               case 65:
                  ((q3f)var5.k5()).n5("text", var2, "expression");
                  break;
               case 66:
                  ((e3a)var5.k5()).n5("text", var2, "text-input");
                  break;
               case 67:
                  ((n3v)var5.k5()).n5("text", var2, "initial-creator");
                  break;
               case 68:
                  ((y5z)var5.k5()).n5("text", var2, "creation-date");
                  break;
               case 69:
                  ((q7n)var5.k5()).n5("text", var2, "creation-time");
                  break;
               case 70:
                  ((n0r)var5.k5()).n5("text", var2, "description");
                  break;
               case 71:
                  ((q8c)var5.k5()).n5("text", var2, "user-defined");
                  break;
               case 72:
                  ((q1l)var5.k5()).n5("text", var2, "print-time");
                  break;
               case 73:
                  ((c2l)var5.k5()).n5("text", var2, "print-date");
                  break;
               case 74:
                  ((z4n)var5.k5()).n5("text", var2, "printed-by");
                  break;
               case 75:
                  ((q4b)var5.k5()).n5("text", var2, "title");
                  break;
               case 76:
                  ((y4f)var5.k5()).n5("text", var2, "subject");
                  break;
               case 77:
                  ((k6a)var5.k5()).n5("text", var2, "keywords");
                  break;
               case 78:
                  ((e6p)var5.k5()).n5("text", var2, "editing-cycles");
                  break;
               case 79:
                  ((x4r)var5.k5()).n5("text", var2, "editing-duration");
                  break;
               case 80:
                  ((d3p)var5.k5()).n5("text", var2, "modification-time");
                  break;
               case 81:
                  ((k7n)var5.k5()).n5("text", var2, "modification-date");
                  break;
               case 82:
                  ((x8t)var5.k5()).n5("text", var2, "creator");
                  break;
               case 83:
                  ((p1w)var5.k5()).n5("text", var2, "page-count");
                  break;
               case 84:
                  ((g4v)var5.k5()).n5("text", var2, "paragraph-count");
                  break;
               case 85:
                  ((d4c)var5.k5()).n5("text", var2, "word-count");
                  break;
               case 86:
                  ((b0t)var5.k5()).n5("text", var2, "character-count");
                  break;
               case 87:
                  ((a5a)var5.k5()).n5("text", var2, "table-count");
                  break;
               case 88:
                  ((j2z)var5.k5()).n5("text", var2, "image-count");
                  break;
               case 89:
                  ((x1z)var5.k5()).n5("text", var2, "object-count");
                  break;
               case 90:
                  ((j5h)var5.k5()).n5("text", var2, "database-display");
                  break;
               case 91:
                  ((q8x)var5.k5()).n5("text", var2, "database-next");
                  break;
               case 92:
                  ((l6k)var5.k5()).n5("text", var2, "database-row-select");
                  break;
               case 93:
                  ((f3z)var5.k5()).n5("text", var2, "database-row-number");
                  break;
               case 94:
                  ((n7r)var5.k5()).n5("text", var2, "database-name");
                  break;
               case 95:
                  ((q3b)var5.k5()).n5("text", var2, "page-variable-set");
                  break;
               case 96:
                  ((s2u)var5.k5()).n5("text", var2, "page-variable-get");
                  break;
               case 97:
                  ((m7c)var5.k5()).n5("text", var2, "placeholder");
                  break;
               case 98:
                  ((w2h)var5.k5()).n5("text", var2, "conditional-text");
                  break;
               case 99:
                  ((g6c)var5.k5()).n5("text", var2, "hidden-text");
                  break;
               case 100:
                  ((g4x)var5.k5()).n5("text", var2, "reference-ref");
                  break;
               case 101:
                  ((g9d)var5.k5()).n5("text", var2, "bookmark-ref");
                  break;
               case 102:
                  ((n9g)var5.k5()).n5("text", var2, "note-ref");
                  break;
               case 103:
                  ((y5x)var5.k5()).n5("text", var2, "sequence-ref");
                  break;
               case 104:
                  ((k2q)var5.k5()).n5("text", var2, "script");
                  break;
               case 105:
                  ((t5w)var5.k5()).n5("text", var2, "execute-macro");
                  break;
               case 106:
                  ((x0q)var5.k5()).n5("text", var2, "hidden-paragraph");
                  break;
               case 107:
                  ((m2c)var5.k5()).n5("text", var2, "dde-connection");
                  break;
               case 108:
                  ((d0v)var5.k5()).n5("text", var2, "measure");
                  break;
               case 109:
                  ((l9s)var5.k5()).n5("text", var2, "table-formula");
                  break;
               case 110:
                  ((g8t)var5.k5()).n5("text", var2, "toc-mark-start");
                  break;
               case 111:
                  ((w3n)var5.k5()).n5("text", var2, "toc-mark-end");
                  break;
               case 112:
                  ((i6d)var5.k5()).n5("text", var2, "toc-mark");
                  break;
               case 113:
                  ((s6b)var5.k5()).n5("text", var2, "user-index-mark-start");
                  break;
               case 114:
                  ((d5w)var5.k5()).n5("text", var2, "user-index-mark-end");
                  break;
               case 115:
                  ((s6s)var5.k5()).n5("text", var2, "user-index-mark");
                  break;
               case 116:
                  ((e9j)var5.k5()).n5("text", var2, "alphabetical-index-mark-start");
                  break;
               case 117:
                  ((l3c)var5.k5()).n5("text", var2, "alphabetical-index-mark-end");
                  break;
               case 118:
                  ((u4e)var5.k5()).n5("text", var2, "alphabetical-index-mark");
                  break;
               case 119:
                  ((g6o)var5.k5()).n5("text", var2, "bibliography-mark");
                  break;
               case 120:
                  ((o7y)var5.k5()).n5("presentation", var2, "header");
                  break;
               case 121:
                  ((k7u)var5.k5()).n5("presentation", var2, "footer");
                  break;
               case 122:
                  ((b3j)var5.k5()).n5("presentation", var2, "date-time");
                  break;
               case 123:
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
}
