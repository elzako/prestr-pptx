package com.aspose.slides.ms.System.Xml;

public class f2 extends p8 {
   private int c4;
   private int y2;
   private String y1;
   private boolean a0;

   public f2(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      super.n5(var1, var2, var3, var4);
      this.y2 = super.t2;
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      super.n5.n5((byte)super.l6);
      if (var3.length() == 0) {
         super.l6 = k5.n5(var2) & 0xFF;
         if (this.y2 == super.t2 && (super.l6 & 64L) != 0L) {
            this.h0();
         }

         this.c4++;
         super.a6[this.t2++] = 60;
      } else {
         super.l6 = 192L;
         if (this.y2 == super.t2) {
            this.h0();
         }

         this.c4++;
         super.a6[super.t2++] = 60;
         if (var1.length() != 0) {
            super.s7(var1);
            super.a6[super.t2++] = 58;
         }
      }

      super.s7(var2);
      super.y4 = this.t2;
   }

   @Override
   public void n5() {
      super.a6[super.t2++] = 62;
      super.x8 = super.t2;
      if ((this.l6 & 32L) != 0L) {
         this.h0();
         this.k5();
         this.y2 = super.t2;
      } else if ((super.l6 & 64L) != 0L) {
         this.y2 = super.t2;
      }
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.c4--;
      boolean var4 = (super.l6 & 64L) != 0L;
      if (var4 && this.y2 == super.t2 && super.x8 != super.t2) {
         this.h0();
      }

      super.l6(var1, var2, var3);
      super.x8 = 0;
      if (var4) {
         this.y2 = super.t2;
      }
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.a0) {
         this.s7(super.k7);
         this.c4++;
         this.h0();
         this.c4--;
      }

      super.u3(var1, var2, var3);
   }

   @Override
   protected void ac_() {
      this.y2 = this.y2 == super.t2 ? 1 : 0;
      super.ac_();
   }

   private void n5(y7 var1) {
      this.c4 = 0;
      this.y1 = var1.u9();
      this.a0 = var1.h0();
   }

   private void h0() {
      this.s7(super.k7);

      for (int var1 = this.c4; var1 > 0; var1--) {
         this.s7(this.y1);
      }
   }
}
