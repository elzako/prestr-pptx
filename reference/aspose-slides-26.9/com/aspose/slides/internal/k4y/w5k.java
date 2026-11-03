package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w5k extends b3 {
   private String n5;
   private String l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name",
      "text:class-names",
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

   public w5k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      w5k$1 var2 = new w5k$1(this);
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
               switch (u3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 2:
                     h3w var128 = new h3w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "s"}), var128));
                     break;
                  case 3:
                     q3x var6 = new q3x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "tab"}), var6));
                     break;
                  case 4:
                     b5t var7 = new b5t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "line-break"}), var7));
                     break;
                  case 5:
                     j0v var8 = new j0v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "soft-page-break"}), var8));
                     break;
                  case 6:
                     w5k var9 = new w5k(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "span"}), var9));
                     break;
                  case 7:
                     t6t var10 = new t6t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "a"}), var10));
                     break;
                  case 8:
                     a9x var11 = new a9x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark"}), var11));
                     break;
                  case 9:
                     k1z var12 = new k1z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-start"}), var12));
                     break;
                  case 10:
                     v5s var13 = new v5s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-end"}), var13));
                     break;
                  case 11:
                     u7j var14 = new u7j(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark"}), var14));
                     break;
                  case 12:
                     c2e var15 = new c2e(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-start"}), var15));
                     break;
                  case 13:
                     l5b var16 = new l5b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-end"}), var16));
                     break;
                  case 14:
                     r9g var17 = new r9g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note"}), var17));
                     break;
                  case 15:
                     k1s var18 = new k1s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "ruby"}), var18));
                     break;
                  case 16:
                     j8d var19 = new j8d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"office:", "annotation"}), var19));
                     break;
                  case 17:
                     t2s var20 = new t2s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "change-marks"}), var20));
                     break;
                  case 18:
                     e6x var21 = new e6x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "rect"}), var21));
                     break;
                  case 19:
                     j6v var22 = new j6v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "line"}), var22));
                     break;
                  case 20:
                     u5l var23 = new u5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polyline"}), var23));
                     break;
                  case 21:
                     s4p var24 = new s4p(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polygon"}), var24));
                     break;
                  case 22:
                     z7d var25 = new z7d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "regular-polygon"}), var25));
                     break;
                  case 23:
                     c5w var26 = new c5w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "path"}), var26));
                     break;
                  case 24:
                     f1h var27 = new f1h(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "circle"}), var27));
                     break;
                  case 25:
                     d2z var28 = new d2z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "ellipse"}), var28));
                     break;
                  case 26:
                     c4f var29 = new c4f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "g"}), var29));
                     break;
                  case 27:
                     h4i var30 = new h4i(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "page-thumbnail"}), var30));
                     break;
                  case 28:
                     b4f var31 = new b4f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "frame"}), var31));
                     break;
                  case 29:
                     v6z var32 = new v6z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "measure"}), var32));
                     break;
                  case 30:
                     v8v var33 = new v8v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "caption"}), var33));
                     break;
                  case 31:
                     l3d var34 = new l3d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "connector"}), var34));
                     break;
                  case 32:
                     w4a var35 = new w4a(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "control"}), var35));
                     break;
                  case 33:
                     d8f var36 = new d8f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"dr3d:", "scene"}), var36));
                     break;
                  case 34:
                     g3c var37 = new g3c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "custom-shape"}), var37));
                     break;
                  case 35:
                     y3o var38 = new y3o(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "a"}), var38));
                     break;
                  case 36:
                     p3f var39 = new p3f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "date"}), var39));
                     break;
                  case 37:
                     u3b var40 = new u3b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "time"}), var40));
                     break;
                  case 38:
                     y3t var41 = new y3t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-number"}), var41));
                     break;
                  case 39:
                     k2i var42 = new k2i(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-continuation"}), var42));
                     break;
                  case 40:
                     e2r var43 = new e2r(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-firstname"}), var43));
                     break;
                  case 41:
                     d3t var44 = new d3t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-lastname"}), var44));
                     break;
                  case 42:
                     q1k var45 = new q1k(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-initials"}), var45));
                     break;
                  case 43:
                     c1t var46 = new c1t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-title"}), var46));
                     break;
                  case 44:
                     h5p var47 = new h5p(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-position"}), var47));
                     break;
                  case 45:
                     c9e var48 = new c9e(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-email"}), var48));
                     break;
                  case 46:
                     m0t var49 = new m0t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-private"}), var49));
                     break;
                  case 47:
                     q2b var50 = new q2b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-fax"}), var50));
                     break;
                  case 48:
                     k4f var51 = new k4f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-company"}), var51));
                     break;
                  case 49:
                     s5l var52 = new s5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-work"}), var52));
                     break;
                  case 50:
                     h6n var53 = new h6n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-street"}), var53));
                     break;
                  case 51:
                     i2u var54 = new i2u(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-city"}), var54));
                     break;
                  case 52:
                     x6u var55 = new x6u(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-postal-code"}), var55));
                     break;
                  case 53:
                     n9f var56 = new n9f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-country"}), var56));
                     break;
                  case 54:
                     b8o var57 = new b8o(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-state-or-province"}), var57));
                     break;
                  case 55:
                     l7d var58 = new l7d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-name"}), var58));
                     break;
                  case 56:
                     s6o var59 = new s6o(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-initials"}), var59));
                     break;
                  case 57:
                     y1x var60 = new y1x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "chapter"}), var60));
                     break;
                  case 58:
                     r2k var61 = new r2k(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "file-name"}), var61));
                     break;
                  case 59:
                     q2q var62 = new q2q(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "template-name"}), var62));
                     break;
                  case 60:
                     var1.u9();
                     String var63 = var1.z1();
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sheet-name"}), var63));
                     break;
                  case 61:
                     m7g var64 = new m7g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-set"}), var64));
                     break;
                  case 62:
                     u9x var65 = new u9x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-get"}), var65));
                     break;
                  case 63:
                     e0p var66 = new e0p(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-input"}), var66));
                     break;
                  case 64:
                     e9g var67 = new e9g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-get"}), var67));
                     break;
                  case 65:
                     p2f var68 = new p2f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-input"}), var68));
                     break;
                  case 66:
                     s5u var69 = new s5u(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence"}), var69));
                     break;
                  case 67:
                     q3f var70 = new q3f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "expression"}), var70));
                     break;
                  case 68:
                     e3a var71 = new e3a(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "text-input"}), var71));
                     break;
                  case 69:
                     n3v var72 = new n3v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "initial-creator"}), var72));
                     break;
                  case 70:
                     y5z var73 = new y5z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-date"}), var73));
                     break;
                  case 71:
                     q7n var74 = new q7n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-time"}), var74));
                     break;
                  case 72:
                     n0r var75 = new n0r(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "description"}), var75));
                     break;
                  case 73:
                     q8c var76 = new q8c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-defined"}), var76));
                     break;
                  case 74:
                     q1l var77 = new q1l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-time"}), var77));
                     break;
                  case 75:
                     c2l var78 = new c2l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-date"}), var78));
                     break;
                  case 76:
                     z4n var79 = new z4n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "printed-by"}), var79));
                     break;
                  case 77:
                     q4b var80 = new q4b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "title"}), var80));
                     break;
                  case 78:
                     y4f var81 = new y4f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "subject"}), var81));
                     break;
                  case 79:
                     k6a var82 = new k6a(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "keywords"}), var82));
                     break;
                  case 80:
                     e6p var83 = new e6p(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-cycles"}), var83));
                     break;
                  case 81:
                     x4r var84 = new x4r(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-duration"}), var84));
                     break;
                  case 82:
                     d3p var85 = new d3p(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-time"}), var85));
                     break;
                  case 83:
                     k7n var86 = new k7n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-date"}), var86));
                     break;
                  case 84:
                     x8t var87 = new x8t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creator"}), var87));
                     break;
                  case 85:
                     p1w var88 = new p1w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-count"}), var88));
                     break;
                  case 86:
                     g4v var89 = new g4v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "paragraph-count"}), var89));
                     break;
                  case 87:
                     d4c var90 = new d4c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "word-count"}), var90));
                     break;
                  case 88:
                     b0t var91 = new b0t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "character-count"}), var91));
                     break;
                  case 89:
                     a5a var92 = new a5a(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-count"}), var92));
                     break;
                  case 90:
                     j2z var93 = new j2z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "image-count"}), var93));
                     break;
                  case 91:
                     x1z var94 = new x1z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "object-count"}), var94));
                     break;
                  case 92:
                     j5h var95 = new j5h(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-display"}), var95));
                     break;
                  case 93:
                     q8x var96 = new q8x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-next"}), var96));
                     break;
                  case 94:
                     l6k var97 = new l6k(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-select"}), var97));
                     break;
                  case 95:
                     f3z var98 = new f3z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-number"}), var98));
                     break;
                  case 96:
                     n7r var99 = new n7r(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-name"}), var99));
                     break;
                  case 97:
                     q3b var100 = new q3b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-set"}), var100));
                     break;
                  case 98:
                     s2u var101 = new s2u(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-get"}), var101));
                     break;
                  case 99:
                     m7c var102 = new m7c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "placeholder"}), var102));
                     break;
                  case 100:
                     w2h var103 = new w2h(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "conditional-text"}), var103));
                     break;
                  case 101:
                     g6c var104 = new g6c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-text"}), var104));
                     break;
                  case 102:
                     g4x var105 = new g4x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-ref"}), var105));
                     break;
                  case 103:
                     g9d var106 = new g9d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-ref"}), var106));
                     break;
                  case 104:
                     n9g var107 = new n9g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note-ref"}), var107));
                     break;
                  case 105:
                     y5x var108 = new y5x(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence-ref"}), var108));
                     break;
                  case 106:
                     k2q var109 = new k2q(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "script"}), var109));
                     break;
                  case 107:
                     t5w var110 = new t5w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "execute-macro"}), var110));
                     break;
                  case 108:
                     x0q var111 = new x0q(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-paragraph"}), var111));
                     break;
                  case 109:
                     m2c var112 = new m2c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "dde-connection"}), var112));
                     break;
                  case 110:
                     d0v var113 = new d0v(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "measure"}), var113));
                     break;
                  case 111:
                     l9s var114 = new l9s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-formula"}), var114));
                     break;
                  case 112:
                     g8t var115 = new g8t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-start"}), var115));
                     break;
                  case 113:
                     w3n var116 = new w3n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-end"}), var116));
                     break;
                  case 114:
                     i6d var117 = new i6d(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark"}), var117));
                     break;
                  case 115:
                     s6b var118 = new s6b(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-start"}), var118));
                     break;
                  case 116:
                     d5w var119 = new d5w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-end"}), var119));
                     break;
                  case 117:
                     s6s var120 = new s6s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark"}), var120));
                     break;
                  case 118:
                     e9j var121 = new e9j(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-start"}), var121));
                     break;
                  case 119:
                     l3c var122 = new l3c(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-end"}), var122));
                     break;
                  case 120:
                     u4e var123 = new u4e(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark"}), var123));
                     break;
                  case 121:
                     g6o var124 = new g6o(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bibliography-mark"}), var124));
                     break;
                  case 122:
                     o7y var125 = new o7y(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "header"}), var125));
                     break;
                  case 123:
                     k7u var126 = new k7u(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "footer"}), var126));
                     break;
                  case 124:
                     b3j var127 = new b3j(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "date-time"}), var127));
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var5 = var1.z1();
               this.k5.addItem(new g7("_TEXT", var5));
            }
         }
      }
   }

   public w5k() {
      this.u3();
   }

   private void u3() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("text:class-names", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((h3w)var5.k5()).n5("text", var2, "s");
                  break;
               case 3:
                  ((q3x)var5.k5()).n5("text", var2, "tab");
                  break;
               case 4:
                  ((b5t)var5.k5()).n5("text", var2, "line-break");
                  break;
               case 5:
                  ((j0v)var5.k5()).n5("text", var2, "soft-page-break");
                  break;
               case 6:
                  ((w5k)var5.k5()).n5("text", var2, "span");
                  break;
               case 7:
                  ((t6t)var5.k5()).n5("text", var2, "a");
                  break;
               case 8:
                  ((a9x)var5.k5()).n5("text", var2, "bookmark");
                  break;
               case 9:
                  ((k1z)var5.k5()).n5("text", var2, "bookmark-start");
                  break;
               case 10:
                  ((v5s)var5.k5()).n5("text", var2, "bookmark-end");
                  break;
               case 11:
                  ((u7j)var5.k5()).n5("text", var2, "reference-mark");
                  break;
               case 12:
                  ((c2e)var5.k5()).n5("text", var2, "reference-mark-start");
                  break;
               case 13:
                  ((l5b)var5.k5()).n5("text", var2, "reference-mark-end");
                  break;
               case 14:
                  ((r9g)var5.k5()).n5("text", var2, "note");
                  break;
               case 15:
                  ((k1s)var5.k5()).n5("text", var2, "ruby");
                  break;
               case 16:
                  ((j8d)var5.k5()).n5("office", var2, "annotation");
                  break;
               case 17:
                  ((t2s)var5.k5()).n5("text", var2, "change-marks");
                  break;
               case 18:
                  ((e6x)var5.k5()).n5("draw", var2, "rect");
                  break;
               case 19:
                  ((j6v)var5.k5()).n5("draw", var2, "line");
                  break;
               case 20:
                  ((u5l)var5.k5()).n5("draw", var2, "polyline");
                  break;
               case 21:
                  ((s4p)var5.k5()).n5("draw", var2, "polygon");
                  break;
               case 22:
                  ((z7d)var5.k5()).n5("draw", var2, "regular-polygon");
                  break;
               case 23:
                  ((c5w)var5.k5()).n5("draw", var2, "path");
                  break;
               case 24:
                  ((f1h)var5.k5()).n5("draw", var2, "circle");
                  break;
               case 25:
                  ((d2z)var5.k5()).n5("draw", var2, "ellipse");
                  break;
               case 26:
                  ((c4f)var5.k5()).n5("draw", var2, "g");
                  break;
               case 27:
                  ((h4i)var5.k5()).n5("draw", var2, "page-thumbnail");
                  break;
               case 28:
                  ((b4f)var5.k5()).n5("draw", var2, "frame");
                  break;
               case 29:
                  ((v6z)var5.k5()).n5("draw", var2, "measure");
                  break;
               case 30:
                  ((v8v)var5.k5()).n5("draw", var2, "caption");
                  break;
               case 31:
                  ((l3d)var5.k5()).n5("draw", var2, "connector");
                  break;
               case 32:
                  ((w4a)var5.k5()).n5("draw", var2, "control");
                  break;
               case 33:
                  ((d8f)var5.k5()).n5("dr3d", var2, "scene");
                  break;
               case 34:
                  ((g3c)var5.k5()).n5("draw", var2, "custom-shape");
                  break;
               case 35:
                  ((y3o)var5.k5()).n5("draw", var2, "a");
                  break;
               case 36:
                  ((p3f)var5.k5()).n5("text", var2, "date");
                  break;
               case 37:
                  ((u3b)var5.k5()).n5("text", var2, "time");
                  break;
               case 38:
                  ((y3t)var5.k5()).n5("text", var2, "page-number");
                  break;
               case 39:
                  ((k2i)var5.k5()).n5("text", var2, "page-continuation");
                  break;
               case 40:
                  ((e2r)var5.k5()).n5("text", var2, "sender-firstname");
                  break;
               case 41:
                  ((d3t)var5.k5()).n5("text", var2, "sender-lastname");
                  break;
               case 42:
                  ((q1k)var5.k5()).n5("text", var2, "sender-initials");
                  break;
               case 43:
                  ((c1t)var5.k5()).n5("text", var2, "sender-title");
                  break;
               case 44:
                  ((h5p)var5.k5()).n5("text", var2, "sender-position");
                  break;
               case 45:
                  ((c9e)var5.k5()).n5("text", var2, "sender-email");
                  break;
               case 46:
                  ((m0t)var5.k5()).n5("text", var2, "sender-phone-private");
                  break;
               case 47:
                  ((q2b)var5.k5()).n5("text", var2, "sender-fax");
                  break;
               case 48:
                  ((k4f)var5.k5()).n5("text", var2, "sender-company");
                  break;
               case 49:
                  ((s5l)var5.k5()).n5("text", var2, "sender-phone-work");
                  break;
               case 50:
                  ((h6n)var5.k5()).n5("text", var2, "sender-street");
                  break;
               case 51:
                  ((i2u)var5.k5()).n5("text", var2, "sender-city");
                  break;
               case 52:
                  ((x6u)var5.k5()).n5("text", var2, "sender-postal-code");
                  break;
               case 53:
                  ((n9f)var5.k5()).n5("text", var2, "sender-country");
                  break;
               case 54:
                  ((b8o)var5.k5()).n5("text", var2, "sender-state-or-province");
                  break;
               case 55:
                  ((l7d)var5.k5()).n5("text", var2, "author-name");
                  break;
               case 56:
                  ((s6o)var5.k5()).n5("text", var2, "author-initials");
                  break;
               case 57:
                  ((y1x)var5.k5()).n5("text", var2, "chapter");
                  break;
               case 58:
                  ((r2k)var5.k5()).n5("text", var2, "file-name");
                  break;
               case 59:
                  ((q2q)var5.k5()).n5("text", var2, "template-name");
                  break;
               case 60:
                  this.n5("text", var2, "sheet-name", (String)var5.k5(), false);
                  break;
               case 61:
                  ((m7g)var5.k5()).n5("text", var2, "variable-set");
                  break;
               case 62:
                  ((u9x)var5.k5()).n5("text", var2, "variable-get");
                  break;
               case 63:
                  ((e0p)var5.k5()).n5("text", var2, "variable-input");
                  break;
               case 64:
                  ((e9g)var5.k5()).n5("text", var2, "user-field-get");
                  break;
               case 65:
                  ((p2f)var5.k5()).n5("text", var2, "user-field-input");
                  break;
               case 66:
                  ((s5u)var5.k5()).n5("text", var2, "sequence");
                  break;
               case 67:
                  ((q3f)var5.k5()).n5("text", var2, "expression");
                  break;
               case 68:
                  ((e3a)var5.k5()).n5("text", var2, "text-input");
                  break;
               case 69:
                  ((n3v)var5.k5()).n5("text", var2, "initial-creator");
                  break;
               case 70:
                  ((y5z)var5.k5()).n5("text", var2, "creation-date");
                  break;
               case 71:
                  ((q7n)var5.k5()).n5("text", var2, "creation-time");
                  break;
               case 72:
                  ((n0r)var5.k5()).n5("text", var2, "description");
                  break;
               case 73:
                  ((q8c)var5.k5()).n5("text", var2, "user-defined");
                  break;
               case 74:
                  ((q1l)var5.k5()).n5("text", var2, "print-time");
                  break;
               case 75:
                  ((c2l)var5.k5()).n5("text", var2, "print-date");
                  break;
               case 76:
                  ((z4n)var5.k5()).n5("text", var2, "printed-by");
                  break;
               case 77:
                  ((q4b)var5.k5()).n5("text", var2, "title");
                  break;
               case 78:
                  ((y4f)var5.k5()).n5("text", var2, "subject");
                  break;
               case 79:
                  ((k6a)var5.k5()).n5("text", var2, "keywords");
                  break;
               case 80:
                  ((e6p)var5.k5()).n5("text", var2, "editing-cycles");
                  break;
               case 81:
                  ((x4r)var5.k5()).n5("text", var2, "editing-duration");
                  break;
               case 82:
                  ((d3p)var5.k5()).n5("text", var2, "modification-time");
                  break;
               case 83:
                  ((k7n)var5.k5()).n5("text", var2, "modification-date");
                  break;
               case 84:
                  ((x8t)var5.k5()).n5("text", var2, "creator");
                  break;
               case 85:
                  ((p1w)var5.k5()).n5("text", var2, "page-count");
                  break;
               case 86:
                  ((g4v)var5.k5()).n5("text", var2, "paragraph-count");
                  break;
               case 87:
                  ((d4c)var5.k5()).n5("text", var2, "word-count");
                  break;
               case 88:
                  ((b0t)var5.k5()).n5("text", var2, "character-count");
                  break;
               case 89:
                  ((a5a)var5.k5()).n5("text", var2, "table-count");
                  break;
               case 90:
                  ((j2z)var5.k5()).n5("text", var2, "image-count");
                  break;
               case 91:
                  ((x1z)var5.k5()).n5("text", var2, "object-count");
                  break;
               case 92:
                  ((j5h)var5.k5()).n5("text", var2, "database-display");
                  break;
               case 93:
                  ((q8x)var5.k5()).n5("text", var2, "database-next");
                  break;
               case 94:
                  ((l6k)var5.k5()).n5("text", var2, "database-row-select");
                  break;
               case 95:
                  ((f3z)var5.k5()).n5("text", var2, "database-row-number");
                  break;
               case 96:
                  ((n7r)var5.k5()).n5("text", var2, "database-name");
                  break;
               case 97:
                  ((q3b)var5.k5()).n5("text", var2, "page-variable-set");
                  break;
               case 98:
                  ((s2u)var5.k5()).n5("text", var2, "page-variable-get");
                  break;
               case 99:
                  ((m7c)var5.k5()).n5("text", var2, "placeholder");
                  break;
               case 100:
                  ((w2h)var5.k5()).n5("text", var2, "conditional-text");
                  break;
               case 101:
                  ((g6c)var5.k5()).n5("text", var2, "hidden-text");
                  break;
               case 102:
                  ((g4x)var5.k5()).n5("text", var2, "reference-ref");
                  break;
               case 103:
                  ((g9d)var5.k5()).n5("text", var2, "bookmark-ref");
                  break;
               case 104:
                  ((n9g)var5.k5()).n5("text", var2, "note-ref");
                  break;
               case 105:
                  ((y5x)var5.k5()).n5("text", var2, "sequence-ref");
                  break;
               case 106:
                  ((k2q)var5.k5()).n5("text", var2, "script");
                  break;
               case 107:
                  ((t5w)var5.k5()).n5("text", var2, "execute-macro");
                  break;
               case 108:
                  ((x0q)var5.k5()).n5("text", var2, "hidden-paragraph");
                  break;
               case 109:
                  ((m2c)var5.k5()).n5("text", var2, "dde-connection");
                  break;
               case 110:
                  ((d0v)var5.k5()).n5("text", var2, "measure");
                  break;
               case 111:
                  ((l9s)var5.k5()).n5("text", var2, "table-formula");
                  break;
               case 112:
                  ((g8t)var5.k5()).n5("text", var2, "toc-mark-start");
                  break;
               case 113:
                  ((w3n)var5.k5()).n5("text", var2, "toc-mark-end");
                  break;
               case 114:
                  ((i6d)var5.k5()).n5("text", var2, "toc-mark");
                  break;
               case 115:
                  ((s6b)var5.k5()).n5("text", var2, "user-index-mark-start");
                  break;
               case 116:
                  ((d5w)var5.k5()).n5("text", var2, "user-index-mark-end");
                  break;
               case 117:
                  ((s6s)var5.k5()).n5("text", var2, "user-index-mark");
                  break;
               case 118:
                  ((e9j)var5.k5()).n5("text", var2, "alphabetical-index-mark-start");
                  break;
               case 119:
                  ((l3c)var5.k5()).n5("text", var2, "alphabetical-index-mark-end");
                  break;
               case 120:
                  ((u4e)var5.k5()).n5("text", var2, "alphabetical-index-mark");
                  break;
               case 121:
                  ((g6o)var5.k5()).n5("text", var2, "bibliography-mark");
                  break;
               case 122:
                  ((o7y)var5.k5()).n5("presentation", var2, "header");
                  break;
               case 123:
                  ((k7u)var5.k5()).n5("presentation", var2, "footer");
                  break;
               case 124:
                  ((b3j)var5.k5()).n5("presentation", var2, "date-time");
                  break;
               case 125:
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

   public final g7 n5(String var1) {
      g7 var2;
      switch (u3.n5(var1)) {
         case 2:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "s"}), new h3w());
            break;
         case 3:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "tab"}), new q3x());
            break;
         case 4:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "line-break"}), new b5t());
            break;
         case 5:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "soft-page-break"}), new j0v());
            break;
         case 6:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "span"}), new w5k());
            break;
         case 7:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "a"}), new t6t());
            break;
         case 8:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark"}), new a9x());
            break;
         case 9:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-start"}), new k1z());
            break;
         case 10:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-end"}), new v5s());
            break;
         case 11:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark"}), new u7j());
            break;
         case 12:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-start"}), new c2e());
            break;
         case 13:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-mark-end"}), new l5b());
            break;
         case 14:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note"}), new r9g());
            break;
         case 15:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "ruby"}), new k1s());
            break;
         case 16:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"office:", "annotation"}), new j8d());
            break;
         case 17:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "change-marks"}), new t2s());
            break;
         case 18:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "rect"}), new e6x());
            break;
         case 19:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "line"}), new j6v());
            break;
         case 20:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polyline"}), new u5l());
            break;
         case 21:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "polygon"}), new s4p());
            break;
         case 22:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "regular-polygon"}), new z7d());
            break;
         case 23:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "path"}), new c5w());
            break;
         case 24:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "circle"}), new f1h());
            break;
         case 25:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "ellipse"}), new d2z());
            break;
         case 26:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "g"}), new c4f());
            break;
         case 27:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "page-thumbnail"}), new h4i());
            break;
         case 28:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "frame"}), new b4f());
            break;
         case 29:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "measure"}), new v6z());
            break;
         case 30:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "caption"}), new v8v());
            break;
         case 31:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "connector"}), new l3d());
            break;
         case 32:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "control"}), new w4a());
            break;
         case 33:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"dr3d:", "scene"}), new d8f());
            break;
         case 34:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "custom-shape"}), new g3c());
            break;
         case 35:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"draw:", "a"}), new y3o());
            break;
         case 36:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "date"}), new p3f());
            break;
         case 37:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "time"}), new u3b());
            break;
         case 38:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-number"}), new y3t());
            break;
         case 39:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-continuation"}), new k2i());
            break;
         case 40:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-firstname"}), new e2r());
            break;
         case 41:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-lastname"}), new d3t());
            break;
         case 42:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-initials"}), new q1k());
            break;
         case 43:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-title"}), new c1t());
            break;
         case 44:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-position"}), new h5p());
            break;
         case 45:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-email"}), new c9e());
            break;
         case 46:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-private"}), new m0t());
            break;
         case 47:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-fax"}), new q2b());
            break;
         case 48:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-company"}), new k4f());
            break;
         case 49:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-phone-work"}), new s5l());
            break;
         case 50:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-street"}), new h6n());
            break;
         case 51:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-city"}), new i2u());
            break;
         case 52:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-postal-code"}), new x6u());
            break;
         case 53:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-country"}), new n9f());
            break;
         case 54:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sender-state-or-province"}), new b8o());
            break;
         case 55:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-name"}), new l7d());
            break;
         case 56:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "author-initials"}), new s6o());
            break;
         case 57:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "chapter"}), new y1x());
            break;
         case 58:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "file-name"}), new r2k());
            break;
         case 59:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "template-name"}), new q2q());
            break;
         case 60:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sheet-name"}), com.aspose.slides.ms.System.d1.n5);
            break;
         case 61:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-set"}), new m7g());
            break;
         case 62:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-get"}), new u9x());
            break;
         case 63:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "variable-input"}), new e0p());
            break;
         case 64:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-get"}), new e9g());
            break;
         case 65:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-field-input"}), new p2f());
            break;
         case 66:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence"}), new s5u());
            break;
         case 67:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "expression"}), new q3f());
            break;
         case 68:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "text-input"}), new e3a());
            break;
         case 69:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "initial-creator"}), new n3v());
            break;
         case 70:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-date"}), new y5z());
            break;
         case 71:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creation-time"}), new q7n());
            break;
         case 72:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "description"}), new n0r());
            break;
         case 73:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-defined"}), new q8c());
            break;
         case 74:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-time"}), new q1l());
            break;
         case 75:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "print-date"}), new c2l());
            break;
         case 76:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "printed-by"}), new z4n());
            break;
         case 77:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "title"}), new q4b());
            break;
         case 78:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "subject"}), new y4f());
            break;
         case 79:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "keywords"}), new k6a());
            break;
         case 80:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-cycles"}), new e6p());
            break;
         case 81:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "editing-duration"}), new x4r());
            break;
         case 82:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-time"}), new d3p());
            break;
         case 83:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "modification-date"}), new k7n());
            break;
         case 84:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "creator"}), new x8t());
            break;
         case 85:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-count"}), new p1w());
            break;
         case 86:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "paragraph-count"}), new g4v());
            break;
         case 87:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "word-count"}), new d4c());
            break;
         case 88:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "character-count"}), new b0t());
            break;
         case 89:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-count"}), new a5a());
            break;
         case 90:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "image-count"}), new j2z());
            break;
         case 91:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "object-count"}), new x1z());
            break;
         case 92:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-display"}), new j5h());
            break;
         case 93:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-next"}), new q8x());
            break;
         case 94:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-select"}), new l6k());
            break;
         case 95:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-row-number"}), new f3z());
            break;
         case 96:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "database-name"}), new n7r());
            break;
         case 97:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-set"}), new q3b());
            break;
         case 98:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "page-variable-get"}), new s2u());
            break;
         case 99:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "placeholder"}), new m7c());
            break;
         case 100:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "conditional-text"}), new w2h());
            break;
         case 101:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-text"}), new g6c());
            break;
         case 102:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "reference-ref"}), new g4x());
            break;
         case 103:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bookmark-ref"}), new g9d());
            break;
         case 104:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "note-ref"}), new n9g());
            break;
         case 105:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "sequence-ref"}), new y5x());
            break;
         case 106:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "script"}), new k2q());
            break;
         case 107:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "execute-macro"}), new t5w());
            break;
         case 108:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "hidden-paragraph"}), new x0q());
            break;
         case 109:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "dde-connection"}), new m2c());
            break;
         case 110:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "measure"}), new d0v());
            break;
         case 111:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "table-formula"}), new l9s());
            break;
         case 112:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-start"}), new g8t());
            break;
         case 113:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark-end"}), new w3n());
            break;
         case 114:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "toc-mark"}), new i6d());
            break;
         case 115:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-start"}), new s6b());
            break;
         case 116:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark-end"}), new d5w());
            break;
         case 117:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "user-index-mark"}), new s6s());
            break;
         case 118:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-start"}), new e9j());
            break;
         case 119:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark-end"}), new l3c());
            break;
         case 120:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "alphabetical-index-mark"}), new u4e());
            break;
         case 121:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"text:", "bibliography-mark"}), new g6o());
            break;
         case 122:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "header"}), new o7y());
            break;
         case 123:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "footer"}), new k7u());
            break;
         case 124:
            var2 = new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "date-time"}), new b3j());
            break;
         case 125:
            var2 = new g7("_TEXT", com.aspose.slides.ms.System.d1.n5);
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k5.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final List<g7> l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(w5k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(w5k var0, String var1) {
      return var0.l6 = var1;
   }
}
