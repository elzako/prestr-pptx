package com.aspose.slides.internal.g9;

import com.aspose.slides.Collections.Generic.Dictionary;

public class t4 extends a6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private u3 l6;
   private Dictionary<Integer, float[]> k5;
   private a6 u3;
   private com.aspose.slides.internal.j0.l6 a6;

   public static String n5() {
      return "Separation";
   }

   @Override
   public u3 k5() {
      if (this.l6 == null) {
         this.l6 = new u3(new float[]{1.0F}, this);
      }

      return this.l6;
   }

   public t4() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.n5u);
      this.n5.n5(com.aspose.slides.internal.v2.c8.l6(""));
   }

   public t4(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
      this.u3 = com.aspose.slides.internal.g9.a6.n5(this.n5.l6(2));
      this.a6 = com.aspose.slides.internal.j0.l6.n5(this.n5.l6(3));
   }

   @Override
   public String u3() {
      return n5();
   }

   @Override
   public int a6() {
      a6 var1 = this.l6();
      return var1.a6();
   }

   public final a6 l6() {
      com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(2);
      return u9.n5(var1);
   }

   public final com.aspose.slides.internal.j0.l6 u9() {
      com.aspose.slides.internal.v2.s7 var1 = this.n5.l6(3);
      return com.aspose.slides.internal.j0.l6.n5(var1);
   }

   public final com.aspose.slides.internal.v2.n5 l6(com.aspose.slides.internal.v2.s7 var1) {
      com.aspose.slides.internal.j0.l6 var2 = this.u9();
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      var3.n5(var1);
      return var2.n5(var3);
   }

   @Override
   public float[] n5(float[] var1) {
      if (this.k5 == null) {
         this.k5 = new Dictionary<>();
      }

      int var2 = com.aspose.slides.internal.v6g.k5.u3(var1[0] * 255.0F, 13);
      float[] var3 = null;
      if (this.k5.containsKey(var2)) {
         var3 = this.k5.get_Item(var2);
         if (var3 != null) {
            return (float[])var3;
         }
      }

      float[] var4 = this.a6.n5(var1);
      float[] var6 = this.u3.n5(var4);
      this.k5.addItem(var2, var6);
      return var6;
   }
}
