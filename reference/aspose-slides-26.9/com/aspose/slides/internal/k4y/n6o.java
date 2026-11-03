package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class n6o extends b3 {
   private i7t n5;
   private d2k l6;
   private l5n k5;
   private s4e u3;
   private List<w0j> a6;
   private j8t u9;
   private i7i h0;
   private f9k c8;
   private q5m t2;
   private s8n s7;
   private b4o x8;
   private m0y n3;
   private l5g y4;
   private f8j e2;
   private y9a t9;
   private d6b z1;
   private List<b6w> t4;
   private n1s q0;
   private b7j z3;
   private i1l m1;
   private q2r k7;
   private a6f m3;
   private t6r z8;
   private h3v j5;
   private h3v w1;
   private z5o r4;
   private k3o c4;
   private v5x y2;
   private i2z y1;
   private b5s a0;
   private t5d d2;
   private t5d d5;
   private v5z s3;
   private c0v p8;
   private v1x f2;
   private p1f i1;
   private z4d e5;
   private l0k b3;
   private static final com.aspose.slides.internal.v6g.u9 o0 = new com.aspose.slides.internal.v6g.u9(
      "sheetPr",
      "dimension",
      "sheetViews",
      "sheetFormatPr",
      "cols",
      "sheetData",
      "sheetCalcPr",
      "sheetProtection",
      "protectedRanges",
      "scenarios",
      "autoFilter",
      "sortState",
      "dataConsolidate",
      "customSheetViews",
      "mergeCells",
      "phoneticPr",
      "conditionalFormatting",
      "dataValidations",
      "hyperlinks",
      "printOptions",
      "pageMargins",
      "pageSetup",
      "headerFooter",
      "rowBreaks",
      "colBreaks",
      "customProperties",
      "cellWatches",
      "ignoredErrors",
      "smartTags",
      "drawing",
      "legacyDrawing",
      "legacyDrawingHF",
      "picture",
      "oleObjects",
      "controls",
      "webPublishItems",
      "tableParts",
      "extLst"
   );

   public n6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.v4();
      n5(var1, new n6o$1(this, var1));
   }

   public n6o() {
      this.v4();
      this.u9 = new j8t();
   }

   private void v4() {
      this.a6 = new List<>();
      this.t4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "sheetPr");
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "dimension");
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "sheetViews");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "sheetFormatPr");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            w0j var5 = (w0j)var4.next();
            var5.n5("ssml", var2, "cols");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.u9.n5("ssml", var2, "sheetData");
      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "sheetCalcPr");
      }

      if (this.c8 != null) {
         this.c8.n5("ssml", var2, "sheetProtection");
      }

      if (this.t2 != null) {
         this.t2.n5("ssml", var2, "protectedRanges");
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "scenarios");
      }

      if (this.x8 != null) {
         this.x8.n5("ssml", var2, "autoFilter");
      }

      if (this.n3 != null) {
         this.n3.n5("ssml", var2, "sortState");
      }

      if (this.y4 != null) {
         this.y4.n5("ssml", var2, "dataConsolidate");
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "customSheetViews");
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "mergeCells");
      }

      if (this.z1 != null) {
         this.z1.n5("ssml", var2, "phoneticPr");
      }

      List$Enumerator var14 = this.t4.iterator();

      try {
         while (var14.hasNext()) {
            b6w var6 = (b6w)var14.next();
            var6.n5("ssml", var2, "conditionalFormatting");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.q0 != null) {
         this.q0.n5("ssml", var2, "dataValidations");
      }

      if (this.z3 != null) {
         this.z3.n5("ssml", var2, "hyperlinks");
      }

      if (this.m1 != null) {
         this.m1.n5("ssml", var2, "printOptions");
      }

      if (this.k7 != null) {
         this.k7.n5("ssml", var2, "pageMargins");
      }

      if (this.m3 != null) {
         this.m3.n5("ssml", var2, "pageSetup");
      }

      if (this.z8 != null) {
         this.z8.n5("ssml", var2, "headerFooter");
      }

      if (this.j5 != null) {
         this.j5.n5("ssml", var2, "rowBreaks");
      }

      if (this.w1 != null) {
         this.w1.n5("ssml", var2, "colBreaks");
      }

      if (this.r4 != null) {
         this.r4.n5("ssml", var2, "customProperties");
      }

      if (this.c4 != null) {
         this.c4.n5("ssml", var2, "cellWatches");
      }

      if (this.y2 != null) {
         this.y2.n5("ssml", var2, "ignoredErrors");
      }

      if (this.y1 != null) {
         this.y1.n5("ssml", var2, "smartTags");
      }

      if (this.a0 != null) {
         this.a0.n5("ssml", var2, "drawing");
      }

      if (this.d2 != null) {
         this.d2.n5("ssml", var2, "legacyDrawing");
      }

      if (this.d5 != null) {
         this.d5.n5("ssml", var2, "legacyDrawingHF");
      }

      if (this.s3 != null) {
         this.s3.n5("ssml", var2, "picture");
      }

      if (this.p8 != null) {
         this.p8.n5("ssml", var2, "oleObjects");
      }

      if (this.f2 != null) {
         this.f2.n5("ssml", var2, "controls");
      }

      if (this.i1 != null) {
         this.i1.n5("ssml", var2, "webPublishItems");
      }

      if (this.e5 != null) {
         this.e5.n5("ssml", var2, "tableParts");
      }

      if (this.b3 != null) {
         this.b3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(i7t var1) {
      this.n5 = var1;
   }

   public final void n5(d2k var1) {
      this.l6 = var1;
   }

   public final void n5(l5n var1) {
      this.k5 = var1;
   }

   public final void n5(s4e var1) {
      this.u3 = var1;
   }

   public final void n5(w0j var1) {
      this.a6.addItem(var1);
   }

   public final void n5(i7i var1) {
      this.h0 = var1;
   }

   public final void n5(f9k var1) {
      this.c8 = var1;
   }

   public final void n5(q5m var1) {
      this.t2 = var1;
   }

   public final void n5(s8n var1) {
      this.s7 = var1;
   }

   public final void n5(b4o var1) {
      this.x8 = var1;
   }

   public final void n5(m0y var1) {
      this.n3 = var1;
   }

   public final void n5(l5g var1) {
      this.y4 = var1;
   }

   public final void n5(f8j var1) {
      this.e2 = var1;
   }

   public final void n5(y9a var1) {
      this.t9 = var1;
   }

   public final void n5(d6b var1) {
      this.z1 = var1;
   }

   public final void n5(b6w var1) {
      this.t4.addItem(var1);
   }

   public final void n5(n1s var1) {
      this.q0 = var1;
   }

   public final void n5(b7j var1) {
      this.z3 = var1;
   }

   public final void n5(i1l var1) {
      this.m1 = var1;
   }

   public final void n5(q2r var1) {
      this.k7 = var1;
   }

   public final void n5(a6f var1) {
      this.m3 = var1;
   }

   public final void n5(t6r var1) {
      this.z8 = var1;
   }

   public final void n5(h3v var1) {
      this.j5 = var1;
   }

   public final void l6(h3v var1) {
      this.w1 = var1;
   }

   public final void n5(z5o var1) {
      this.r4 = var1;
   }

   public final void n5(k3o var1) {
      this.c4 = var1;
   }

   public final void n5(v5x var1) {
      this.y2 = var1;
   }

   public final void n5(i2z var1) {
      this.y1 = var1;
   }

   public final void n5(b5s var1) {
      this.a0 = var1;
   }

   public final void n5(t5d var1) {
      this.d2 = var1;
   }

   public final void l6(t5d var1) {
      this.d5 = var1;
   }

   public final void n5(v5z var1) {
      this.s3 = var1;
   }

   public final void n5(c0v var1) {
      this.p8 = var1;
   }

   public final void n5(v1x var1) {
      this.f2 = var1;
   }

   public final void n5(p1f var1) {
      this.i1 = var1;
   }

   public final z4d n5() {
      if (this.e5 != null) {
         throw new Exception("Only one <tableParts> element can be added.");
      }

      this.e5 = new z4d();
      return this.e5;
   }

   public final void n5(l0k var1) {
      this.b3 = var1;
   }

   public final i7t l6() {
      return this.n5;
   }

   public final d2k k5() {
      return this.l6;
   }

   public final l5n u3() {
      return this.k5;
   }

   public final s4e a6() {
      return this.u3;
   }

   public final w0j[] u9() {
      return this.a6.toArray(new w0j[0]);
   }

   public final j8t h0() {
      return this.u9;
   }

   public final i7i c8() {
      return this.h0;
   }

   public final f9k t2() {
      return this.c8;
   }

   public final q5m s7() {
      return this.t2;
   }

   public final s8n x8() {
      return this.s7;
   }

   public final b4o n3() {
      return this.x8;
   }

   public final m0y y4() {
      return this.n3;
   }

   public final l5g e2() {
      return this.y4;
   }

   public final f8j t9() {
      return this.e2;
   }

   public final y9a z1() {
      return this.t9;
   }

   public final d6b t4() {
      return this.z1;
   }

   public final b6w[] q0() {
      return this.t4.toArray(new b6w[0]);
   }

   public final n1s z3() {
      return this.q0;
   }

   public final b7j m1() {
      return this.z3;
   }

   public final i1l k7() {
      return this.m1;
   }

   public final q2r m3() {
      return this.k7;
   }

   public final a6f z8() {
      return this.m3;
   }

   public final t6r j5() {
      return this.z8;
   }

   public final h3v w1() {
      return this.j5;
   }

   public final h3v r4() {
      return this.w1;
   }

   public final z5o c4() {
      return this.r4;
   }

   public final k3o y2() {
      return this.c4;
   }

   public final v5x y1() {
      return this.y2;
   }

   public final i2z a0() {
      return this.y1;
   }

   public final b5s d2() {
      return this.a0;
   }

   public final t5d d5() {
      return this.d2;
   }

   public final t5d s3() {
      return this.d5;
   }

   public final v5z p8() {
      return this.s3;
   }

   public final c0v f2() {
      return this.p8;
   }

   public final v1x i1() {
      return this.f2;
   }

   public final p1f e5() {
      return this.i1;
   }

   public final z4d b3() {
      return this.e5;
   }

   public final l0k o0() {
      return this.b3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z7() {
      return o0;
   }

   // $VF: synthetic method
   static i7t n5(n6o var0, i7t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static d2k n5(n6o var0, d2k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l5n n5(n6o var0, l5n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s4e n5(n6o var0, s4e var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(n6o var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static j8t n5(n6o var0, j8t var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static i7i n5(n6o var0, i7i var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static f9k n5(n6o var0, f9k var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static q5m n5(n6o var0, q5m var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static s8n n5(n6o var0, s8n var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static b4o n5(n6o var0, b4o var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static m0y n5(n6o var0, m0y var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static l5g n5(n6o var0, l5g var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static f8j n5(n6o var0, f8j var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static y9a n5(n6o var0, y9a var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static d6b n5(n6o var0, d6b var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static List l6(n6o var0) {
      return var0.t4;
   }

   // $VF: synthetic method
   static n1s n5(n6o var0, n1s var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static b7j n5(n6o var0, b7j var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static i1l n5(n6o var0, i1l var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static q2r n5(n6o var0, q2r var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static a6f n5(n6o var0, a6f var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static t6r n5(n6o var0, t6r var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static h3v n5(n6o var0, h3v var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static h3v l6(n6o var0, h3v var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static z5o n5(n6o var0, z5o var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static k3o n5(n6o var0, k3o var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static v5x n5(n6o var0, v5x var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static i2z n5(n6o var0, i2z var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static b5s n5(n6o var0, b5s var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static t5d n5(n6o var0, t5d var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static t5d l6(n6o var0, t5d var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static v5z n5(n6o var0, v5z var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static c0v n5(n6o var0, c0v var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static v1x n5(n6o var0, v1x var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static p1f n5(n6o var0, p1f var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static z4d n5(n6o var0, z4d var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static l0k n5(n6o var0, l0k var1) {
      return var0.b3 = var1;
   }
}
