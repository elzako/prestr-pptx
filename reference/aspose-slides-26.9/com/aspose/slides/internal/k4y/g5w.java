package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g5w extends b3 {
   private y1t n5;
   private z5n l6;
   private x3h k5;
   private h5f u3;
   private f8w a6;
   private j0t u9;
   private a5n h0;
   private w7n c8;
   private p6u t2;
   private a2s s7;
   private m0j x8;
   private r6k n3;
   private x5t y4;
   private v3o e2;
   private a4j t9;
   private x3q z1;
   private List<v2i> t4;
   private h3p q0;
   private l0k z3;
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "fileVersion",
      "fileSharing",
      "workbookPr",
      "workbookProtection",
      "bookViews",
      "sheets",
      "functionGroups",
      "externalReferences",
      "definedNames",
      "calcPr",
      "oleSize",
      "customWorkbookViews",
      "pivotCaches",
      "smartTagPr",
      "smartTagTypes",
      "webPublishing",
      "fileRecoveryPr",
      "webPublishObjects",
      "extLst"
   );

   public g5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k7();
      n5(var1, new g5w$1(this, var1));
   }

   public g5w() {
      this.k7();
      this.u9 = new j0t();
   }

   private void k7() {
      this.t4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "fileVersion");
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "fileSharing");
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "workbookPr");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "workbookProtection");
      }

      if (this.a6 != null) {
         this.a6.n5("ssml", var2, "bookViews");
      }

      this.u9.n5("ssml", var2, "sheets");
      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "functionGroups");
      }

      if (this.c8 != null) {
         this.c8.n5("ssml", var2, "externalReferences");
      }

      if (this.t2 != null) {
         this.t2.n5("ssml", var2, "definedNames");
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "calcPr");
      }

      if (this.x8 != null) {
         this.x8.n5("ssml", var2, "oleSize");
      }

      if (this.n3 != null) {
         this.n3.n5("ssml", var2, "customWorkbookViews");
      }

      if (this.y4 != null) {
         this.y4.n5("ssml", var2, "pivotCaches");
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "smartTagPr");
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "smartTagTypes");
      }

      if (this.z1 != null) {
         this.z1.n5("ssml", var2, "webPublishing");
      }

      List$Enumerator var4 = this.t4.iterator();

      try {
         while (var4.hasNext()) {
            v2i var5 = (v2i)var4.next();
            var5.n5("ssml", var2, "fileRecoveryPr");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.q0 != null) {
         this.q0.n5("ssml", var2, "webPublishObjects");
      }

      if (this.z3 != null) {
         this.z3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(y1t var1) {
      this.n5 = var1;
   }

   public final void n5(z5n var1) {
      this.l6 = var1;
   }

   public final void n5(x3h var1) {
      this.k5 = var1;
   }

   public final void n5(h5f var1) {
      this.u3 = var1;
   }

   public final void n5(f8w var1) {
      this.a6 = var1;
   }

   public final void n5(a5n var1) {
      this.h0 = var1;
   }

   public final void n5(w7n var1) {
      this.c8 = var1;
   }

   public final void n5(p6u var1) {
      this.t2 = var1;
   }

   public final void n5(a2s var1) {
      this.s7 = var1;
   }

   public final void n5(m0j var1) {
      this.x8 = var1;
   }

   public final void n5(r6k var1) {
      this.n3 = var1;
   }

   public final void n5(x5t var1) {
      this.y4 = var1;
   }

   public final void n5(v3o var1) {
      this.e2 = var1;
   }

   public final void n5(a4j var1) {
      this.t9 = var1;
   }

   public final void n5(x3q var1) {
      this.z1 = var1;
   }

   public final void n5(v2i var1) {
      this.t4.addItem(var1);
   }

   public final void n5(h3p var1) {
      this.q0 = var1;
   }

   public final void n5(l0k var1) {
      this.z3 = var1;
   }

   public final y1t n5() {
      return this.n5;
   }

   public final z5n l6() {
      return this.l6;
   }

   public final x3h k5() {
      return this.k5;
   }

   public final h5f u3() {
      return this.u3;
   }

   public final f8w a6() {
      return this.a6;
   }

   public final j0t u9() {
      return this.u9;
   }

   public final a5n h0() {
      return this.h0;
   }

   public final w7n c8() {
      return this.c8;
   }

   public final p6u t2() {
      return this.t2;
   }

   public final a2s s7() {
      return this.s7;
   }

   public final m0j x8() {
      return this.x8;
   }

   public final r6k n3() {
      return this.n3;
   }

   public final x5t y4() {
      return this.y4;
   }

   public final v3o e2() {
      return this.e2;
   }

   public final a4j t9() {
      return this.t9;
   }

   public final x3q z1() {
      return this.z1;
   }

   public final v2i[] t4() {
      return this.t4.toArray(new v2i[0]);
   }

   public final h3p q0() {
      return this.q0;
   }

   public final l0k z3() {
      return this.z3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 m1() {
      return m1;
   }

   // $VF: synthetic method
   static y1t n5(g5w var0, y1t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z5n n5(g5w var0, z5n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x3h n5(g5w var0, x3h var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h5f n5(g5w var0, h5f var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static f8w n5(g5w var0, f8w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j0t n5(g5w var0, j0t var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a5n n5(g5w var0, a5n var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static w7n n5(g5w var0, w7n var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static p6u n5(g5w var0, p6u var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static a2s n5(g5w var0, a2s var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static m0j n5(g5w var0, m0j var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static r6k n5(g5w var0, r6k var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static x5t n5(g5w var0, x5t var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static v3o n5(g5w var0, v3o var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static a4j n5(g5w var0, a4j var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static x3q n5(g5w var0, x3q var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static List n5(g5w var0) {
      return var0.t4;
   }

   // $VF: synthetic method
   static h3p n5(g5w var0, h3p var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static l0k n5(g5w var0, l0k var1) {
      return var0.z3 = var1;
   }
}
