package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public final class x1i extends b3 {
   private int n5 = 0;
   private boolean l6 = false;
   private long k5 = 4294967295L;
   private String u3;
   private long a6 = 4294967295L;
   private e8j u9;
   private b9y h0;
   private f9o c8;
   private j6b t2;
   private List<l4s> s7 = new List<>();
   private t7m x8;
   private b3r n3;
   private d6z y4;
   private List<Long> e2 = new List<>();
   private h6m t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "layoutId",
      "hidden",
      "ownerIdx",
      "uniqueId",
      "formatIdx",
      "tx",
      "spPr",
      "valueColors",
      "valueColorPositions",
      "dataPt",
      "dataLabels",
      "dataId",
      "layoutPr",
      "axisId",
      "extLst"
   );

   public x1i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new x1i$1(this));
      n5(var1, new x1i$2(this, var1));
   }

   public x1i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("layoutId", w5y.n5(this.n5));
      if (this.l6) {
         var2.l6("hidden", this.l6 ? "1" : "0");
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("ownerIdx", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("uniqueId", this.u3);
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("formatIdx", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "tx");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "spPr");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "valueColors");
      }

      if (this.t2 != null) {
         this.t2.n5("cx", var2, "valueColorPositions");
      }

      List$Enumerator var4 = this.s7.iterator();

      try {
         while (var4.hasNext()) {
            l4s var5 = (l4s)var4.next();
            var5.n5("cx", var2, "dataPt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.x8 != null) {
         this.x8.n5("cx", var2, "dataLabels");
      }

      if (this.n3 != null) {
         this.n3.n5("cx", var2, "dataId");
      }

      if (this.y4 != null) {
         this.y4.n5("cx", var2, "layoutPr");
      }

      List$Enumerator var16 = this.e2.iterator();

      try {
         while (var16.hasNext()) {
            long var7 = com.aspose.slides.internal.v6g.k5.u3(var16.next(), long.class);
            var2.n5(var1, "axisId", null);
            var2.l6("val", com.aspose.slides.ms.System.l4.l6(var7));
            var2.s7();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      if (this.t9 != null) {
         this.t9.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final e8j n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.u9 = new e8j();
      return this.u9;
   }

   public final b9y l6() {
      if (this.h0 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.h0 = new b9y();
      return this.h0;
   }

   public final void n5(f9o var1) {
      this.c8 = var1;
   }

   public final l4s k5() {
      l4s var1 = new l4s();
      this.s7.addItem(var1);
      return var1;
   }

   public final t7m u3() {
      if (this.x8 != null) {
         throw new Exception("Only one <dataLabels> element can be added.");
      }

      this.x8 = new t7m();
      return this.x8;
   }

   public final void n5(b3r var1) {
      this.n3 = var1;
   }

   public final void n5(d6z var1) {
      this.y4 = var1;
   }

   public final void n5(long var1) {
      this.e2.addItem(var1);
   }

   public final void n5(h6m var1) {
      this.t9 = var1;
   }

   public final int a6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean u9() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final long h0() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final long c8() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final e8j t2() {
      return this.u9;
   }

   public final b9y s7() {
      return this.h0;
   }

   public final f9o x8() {
      return this.c8;
   }

   public final l4s[] n3() {
      return this.s7.toArray(new l4s[0]);
   }

   public final t7m y4() {
      return this.x8;
   }

   public final b3r e2() {
      return this.n3;
   }

   public final d6z t9() {
      return this.y4;
   }

   public final h6m z1() {
      return this.t9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t4() {
      return z1;
   }

   // $VF: synthetic method
   static int n5(x1i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x1i var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(x1i var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(x1i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long l6(x1i var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e8j n5(x1i var0, e8j var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static b9y n5(x1i var0, b9y var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static f9o n5(x1i var0, f9o var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static j6b n5(x1i var0, j6b var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static List n5(x1i var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static t7m n5(x1i var0, t7m var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static b3r n5(x1i var0, b3r var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static d6z n5(x1i var0, d6z var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static List l6(x1i var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static h6m n5(x1i var0, h6m var1) {
      return var0.t9 = var1;
   }
}
