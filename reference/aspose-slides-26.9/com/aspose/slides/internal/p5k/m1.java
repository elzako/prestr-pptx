package com.aspose.slides.internal.p5k;

public class m1 extends com.aspose.slides.internal.e1.y4 {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 l6 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private boolean u3;
   private boolean a6;
   private boolean u9 = true;

   private m1() {
   }

   public static boolean k5(com.aspose.slides.internal.e1.r4 var0) {
      m1 var1 = new m1();
      var1.l6(var0);
      return var1.u9 || var0.x8();
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.r4 var1) {
      this.u3 = true;
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c4 var1) {
      this.a6 = true;
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      if (var1.n5().size() > 0) {
         if (this.u3) {
            var1.n5().get_Item(0).n5(this.n5);
            this.n5.n5(this.l6);
         }

         if (this.a6 && !this.u3) {
            var1.n5().get_Item(0).n5(this.l6);
            this.u9 = this.u9 & this.k5.equals(this.l6.u3());
         }

         this.u3 = false;
         this.a6 = false;
         var1.n5().get_Item(var1.n5().size() - 1).n5(this.k5);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      if (this.u3) {
         var1.n5().n5().n5(this.n5);
         this.n5.n5(this.l6);
      }

      if (this.a6 && !this.u3) {
         var1.n5().n5().n5(this.l6);
         this.u9 = this.u9 & this.k5.equals(this.l6.u3());
      }

      this.u3 = false;
      this.a6 = false;
      var1.n5().u3().n5(this.k5);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.c4 var1) {
      if (var1.n5()) {
         this.l6.n5(this.k5);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.r4 var1) {
      this.u9 = this.u9 & this.k5.equals(this.n5.u3());
   }
}
