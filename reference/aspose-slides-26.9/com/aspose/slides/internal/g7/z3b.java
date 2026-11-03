package com.aspose.slides.internal.g7;

public class z3b extends z1 {
   private byte[] a6;
   private w3 u9;

   public z3b(u7 var1) {
      super(var1, null);
      super.n5(new z1[]{new p4(var1, this, true, true), new w9(var1, this)});
      super.l6 = new byte[0][];
      super.n5 = new byte[0][];
   }

   public final byte[] n5() {
      return this.a6;
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
   }

   public final w3 u3() {
      return this.u9;
   }

   public final void n5(w3 var1) {
      this.u9 = var1;
   }

   public final void t4() {
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
   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var3[0] = var1;
      var2[0] = new byte[0];
      return true;
   }

   @Override
   protected byte[] n5(int var1, int[] var2) {
      var2[0] = -1;
      if (var1 == this.u3.length - 1) {
         var2[0] = var1;
         return new byte[0];
      } else {
         return null;
      }
   }

   @Override
   public void k5() {
      this.n5(new w3());
      this.n5((byte[])null);
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      p4 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, p4.class)) != null) {
         this.u3().n5(var2.n5());
      }

      w9 var3;
      if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, w9.class)) != null) {
         this.n5(var3.n5());
      }

      super.n5(var1);
   }
}
