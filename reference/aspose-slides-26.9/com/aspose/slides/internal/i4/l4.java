package com.aspose.slides.internal.i4;

public class l4 extends u6 {
   private j9 u3;
   private com.aspose.slides.ms.System.i9 a6 = new com.aspose.slides.ms.System.i9();

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      k8 var4;
      if ("abs".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.n5(var3[0].l6()));
      } else if ("asin".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.e2(var3[0].l6()));
      } else if ("atan".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.t9(var3[0].l6()));
      } else if ("atan2".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.u3(var3[0].l6(), var3[1].l6()));
      } else if ("ceil".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.l6(var3[0].l6()));
      } else if ("cos".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.c8(var3[0].l6()));
      } else if ("exp".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.z1(var3[0].l6()));
      } else if ("floor".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.k5(var3[0].l6()));
      } else if ("log".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.t4(var3[0].l6()));
      } else if ("max".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.l6(var3[0].l6(), var3[1].l6()));
      } else if ("min".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.k5(var3[0].l6(), var3[1].l6()));
      } else if ("pow".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.a6(var3[0].l6(), var3[1].l6()));
      } else if ("random".equals(this.n5)) {
         var4 = this.u3.w1().n5(this.a6.l6());
      } else if ("round".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.u3(var3[0].l6()));
      } else if ("sin".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.h0(var3[0].l6()));
      } else if ("sqrt".equals(this.n5)) {
         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.z3(var3[0].l6()));
      } else {
         if (!"tan".equals(this.n5)) {
            throw new j3("unknown math function");
         }

         var4 = this.u3.w1().n5(com.aspose.slides.ms.System.q1.t2(var3[0].l6()));
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public l4(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
