package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a1k extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private l4o k5;
   private s7k u3;
   private s7k a6;
   private s7k u9;
   private s7k h0;
   private s7k c8;
   private s7k t2;
   private s7k s7;
   private s7k x8;
   private s7k n3;
   private s7k y4;
   private s7k e2;
   private s7k t9;
   private s7k z1;
   private l8r t4;
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "styleId",
      "styleName",
      "tblBg",
      "wholeTbl",
      "band1H",
      "band2H",
      "band1V",
      "band2V",
      "lastCol",
      "firstCol",
      "lastRow",
      "seCell",
      "swCell",
      "firstRow",
      "neCell",
      "nwCell",
      "extLst"
   );

   public a1k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s3();
      a1k$1 var2 = new a1k$1(this);
      n5(var1, var2);
      n5(var1, new a1k$2(this, var1));
   }

   public a1k() {
      this.s3();
   }

   private void s3() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("styleId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      var2.l6("styleName", this.l6);
      if (this.k5 != null) {
         this.k5.n5("a", var2, "tblBg");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "wholeTbl");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "band1H");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "band2H");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "band1V");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "band2V");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "lastCol");
      }

      if (this.s7 != null) {
         this.s7.n5("a", var2, "firstCol");
      }

      if (this.x8 != null) {
         this.x8.n5("a", var2, "lastRow");
      }

      if (this.n3 != null) {
         this.n3.n5("a", var2, "seCell");
      }

      if (this.y4 != null) {
         this.y4.n5("a", var2, "swCell");
      }

      if (this.e2 != null) {
         this.e2.n5("a", var2, "firstRow");
      }

      if (this.t9 != null) {
         this.t9.n5("a", var2, "neCell");
      }

      if (this.z1 != null) {
         this.z1.n5("a", var2, "nwCell");
      }

      if (this.t4 != null) {
         this.t4.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final l4o n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <tblBg> element can be added.");
      }

      this.k5 = new l4o();
      return this.k5;
   }

   public final s7k l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <wholeTbl> element can be added.");
      }

      this.u3 = new s7k();
      return this.u3;
   }

   public final s7k k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <band1H> element can be added.");
      }

      this.a6 = new s7k();
      return this.a6;
   }

   public final s7k u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <band2H> element can be added.");
      }

      this.u9 = new s7k();
      return this.u9;
   }

   public final s7k a6() {
      if (this.h0 != null) {
         throw new Exception("Only one <band1V> element can be added.");
      }

      this.h0 = new s7k();
      return this.h0;
   }

   public final s7k u9() {
      if (this.c8 != null) {
         throw new Exception("Only one <band2V> element can be added.");
      }

      this.c8 = new s7k();
      return this.c8;
   }

   public final s7k h0() {
      if (this.t2 != null) {
         throw new Exception("Only one <lastCol> element can be added.");
      }

      this.t2 = new s7k();
      return this.t2;
   }

   public final s7k c8() {
      if (this.s7 != null) {
         throw new Exception("Only one <firstCol> element can be added.");
      }

      this.s7 = new s7k();
      return this.s7;
   }

   public final s7k t2() {
      if (this.x8 != null) {
         throw new Exception("Only one <lastRow> element can be added.");
      }

      this.x8 = new s7k();
      return this.x8;
   }

   public final s7k s7() {
      if (this.n3 != null) {
         throw new Exception("Only one <seCell> element can be added.");
      }

      this.n3 = new s7k();
      return this.n3;
   }

   public final s7k x8() {
      if (this.y4 != null) {
         throw new Exception("Only one <swCell> element can be added.");
      }

      this.y4 = new s7k();
      return this.y4;
   }

   public final s7k n3() {
      if (this.e2 != null) {
         throw new Exception("Only one <firstRow> element can be added.");
      }

      this.e2 = new s7k();
      return this.e2;
   }

   public final s7k y4() {
      if (this.t9 != null) {
         throw new Exception("Only one <neCell> element can be added.");
      }

      this.t9 = new s7k();
      return this.t9;
   }

   public final s7k e2() {
      if (this.z1 != null) {
         throw new Exception("Only one <nwCell> element can be added.");
      }

      this.z1 = new s7k();
      return this.z1;
   }

   public final void n5(x8 var1) {
      this.t4 = (l8r)var1;
   }

   public final com.aspose.slides.ms.System.o0 t9() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final String z1() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final l4o t4() {
      return this.k5;
   }

   public final s7k q0() {
      return this.u3;
   }

   public final s7k z3() {
      return this.a6;
   }

   public final s7k m1() {
      return this.u9;
   }

   public final s7k k7() {
      return this.h0;
   }

   public final s7k m3() {
      return this.c8;
   }

   public final s7k z8() {
      return this.t2;
   }

   public final s7k j5() {
      return this.s7;
   }

   public final s7k w1() {
      return this.x8;
   }

   public final s7k r4() {
      return this.n3;
   }

   public final s7k c4() {
      return this.y4;
   }

   public final s7k y2() {
      return this.e2;
   }

   public final s7k y1() {
      return this.t9;
   }

   public final s7k a0() {
      return this.z1;
   }

   public final x8 d2() {
      return this.t4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 d5() {
      return q0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(a1k var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(a1k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l4o n5(a1k var0, l4o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s7k n5(a1k var0, s7k var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static s7k l6(a1k var0, s7k var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static s7k k5(a1k var0, s7k var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static s7k u3(a1k var0, s7k var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static s7k a6(a1k var0, s7k var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static s7k u9(a1k var0, s7k var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static s7k h0(a1k var0, s7k var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static s7k c8(a1k var0, s7k var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static s7k t2(a1k var0, s7k var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static s7k s7(a1k var0, s7k var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static s7k x8(a1k var0, s7k var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static s7k n3(a1k var0, s7k var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static s7k y4(a1k var0, s7k var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static l8r n5(a1k var0, l8r var1) {
      return var0.t4 = var1;
   }
}
