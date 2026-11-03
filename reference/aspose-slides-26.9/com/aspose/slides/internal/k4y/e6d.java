package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class e6d extends b3 {
   private com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0();
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   private int u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private j3z u9;
   private y1g h0;
   public static final int n5 = b3o.n5("active");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("id", "authorId", "status", "created", "txBody", "extLst");

   public e6d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      e6d$1 var2 = new e6d$1(this);
      n5(var1, var2);
      n5(var1, new e6d$2(this, var1));
   }

   public e6d() {
      this.u9();
   }

   private void u9() {
      com.aspose.slides.ms.System.o0.n5.k5(this.l6);
      com.aspose.slides.ms.System.o0.n5.k5(this.k5);
      this.u3 = n5;
      com.aspose.slides.ms.System.j5.l6.u3(this.a6);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.l6.k5())), "}"}));
      var2.l6("authorId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.k5.k5())), "}"}));
      if (this.u3 != n5) {
         var2.l6("status", b3o.n5(this.u3));
      }

      var2.l6("created", com.aspose.slides.ms.System.Xml.f4.n5(this.a6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      if (this.u9 != null) {
         this.u9.n5("p188", var2, "txBody");
      }

      if (this.h0 != null) {
         this.h0.n5("p188", var2, "extLst");
      }

      var2.s7();
   }

   public final j3z n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <txBody> element can be added.");
      }

      this.u9 = new j3z();
      return this.u9;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.l6);
   }

   public final com.aspose.slides.ms.System.o0 l6() {
      return this.k5;
   }

   public final void l6(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.k5);
   }

   public final com.aspose.slides.ms.System.j5 k5() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.a6);
   }

   public final j3z u3() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(e6d var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 l6(e6d var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(e6d var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(e6d var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static j3z n5(e6d var0, j3z var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y1g n5(e6d var0, y1g var1) {
      return var0.h0 = var1;
   }
}
