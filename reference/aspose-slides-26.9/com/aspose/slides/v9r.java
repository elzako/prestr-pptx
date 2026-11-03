package com.aspose.slides;

class v9r implements r0g {
   private byte n5 = 0;
   private LineFormat l6;
   private ColorFormat k5;
   private long u3;
   private r0g a6;
   private long u9;

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
      this.a6();
   }

   public final ILineFormat l6() {
      return this.l6;
   }

   public final IColorFormat k5() {
      return this.k5;
   }

   public final long u3() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
      this.a6();
   }

   v9r(r0g var1) {
      this.a6 = var1;
      this.l6 = new LineFormat(this);
      this.k5 = new ColorFormat(this);
   }

   final t8r n5(IBaseSlide var1) {
      switch (this.n5) {
         case 0:
         default:
            return null;
         case 1:
            return this.l6.c8();
         case 2:
            n4k var2 = ((s8u)var1.createThemeEffective()).u3(var1, (int)this.u3, this.k5);
            return var2 != null ? var2.n5 : t8r.t4;
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   private void a6() {
      this.u9++;
   }
}
