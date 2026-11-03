package com.aspose.slides.internal.g7;

public class k5 extends z1 {
   private byte[] a6;
   private u2 u9;

   public k5(u7 var1) {
      super(var1, null);
      super.n5(new t9[]{new r8(var1, this), new o9(var1, this), new t3(var1, this), new n5(var1, this)});
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("StartFontMetrics")};
      super.n5 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("EndFontMetrics")};
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
   }

   public final u2 n5() {
      return this.u9;
   }

   public final void n5(u2 var1) {
      this.u9 = var1;
   }

   public final void u3() {
      int var1 = 0;
      int var2 = 0;
      Object var3 = null;
      byte[][] var4 = new byte[][]{(byte[])var3};
      int[] var5 = new int[]{0};
      boolean var6 = this.n5(0, var4, var5);
      var3 = var4[0];
      var2 = var5[0];
      if (var6) {
         int[] var7 = new int[]{0};
         super.l6(var2, var7);
         var1 = var7[0];
      }
   }

   @Override
   public void k5() {
      this.n5(new u2());
      this.n5((byte[])null);
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      n5 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n5.class)) != null) {
         this.n5().n5().n5(var2.n5());
      } else {
         r8 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, r8.class)) != null) {
            a1 var4 = new a1();
            var4.n5("StartCharMetrics");
            var4.n5(var3.n5());
            var4.n5(3);
            this.n5().n5().n5(var4);
         } else {
            t3 var5;
            if ((var5 = com.aspose.slides.internal.v6g.k5.n5(var1, t3.class)) != null) {
               a1 var7 = new a1();
               var7.n5("StartComposites");
               var7.n5(var5.n5());
               var7.n5(3);
               this.n5().n5().n5(var7);
            } else {
               o9 var6;
               if ((var6 = com.aspose.slides.internal.v6g.k5.n5(var1, o9.class)) != null) {
                  a1 var8 = new a1();
                  var8.n5("StartKernPairs");
                  var8.n5(var6.n5());
                  var8.n5(3);
                  this.n5().n5().n5(var8);
                  var8 = new a1();
                  var8.n5("StartTrackKern");
                  var8.n5(var6.u3());
                  var8.n5(3);
                  this.n5().n5().n5(var8);
               }
            }
         }
      }

      super.n5(var1);
   }
}
