package com.aspose.slides.ms.System.Xml;

public class a2 extends n9 {
   protected int n5;
   protected boolean l6;
   protected String k5;
   protected boolean u3;
   private u9 i1;
   protected int s3 = 0;

   public a2(com.aspose.slides.internal.z0k.a0 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   public a2(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      if (!this.u3 && super.s7 != super.t2) {
         this.h0();
      }

      super.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      if (!this.u3 && super.s7 != super.t2) {
         this.h0();
      }

      this.n5++;
      this.i1.n5(this.u3);
      super.n5(var1, var2, var3);
   }

   @Override
   public void n5() {
      if (this.n5 == 1 && this.s3 == 2) {
         this.u3 = false;
      } else {
         this.u3 = this.i1.l6();
      }

      super.n5();
   }

   @Override
   public void k5(int var1) {
      this.s3 = var1;
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.n5--;
      if (!this.u3 && super.x8 != super.t2 && super.s7 != super.t2) {
         this.h0();
      }

      this.u3 = this.i1.n5();
      super.l6(var1, var2, var3);
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.n5--;
      if (!this.u3 && super.x8 != super.t2 && super.s7 != super.t2) {
         this.h0();
      }

      this.u3 = this.i1.n5();
      super.k5(var1, var2, var3);
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.l6) {
         this.h0();
      }

      super.u3(var1, var2, var3);
   }

   @Override
   public void a6(String var1) {
      this.u3 = true;
      super.a6(var1);
   }

   @Override
   public void u9(String var1) {
      if (!this.u3 && super.s7 != super.t2) {
         this.h0();
      }

      super.u9(var1);
   }

   @Override
   public void n5(String var1, String var2) {
      if (!this.u3 && super.s7 != super.t2) {
         this.h0();
      }

      super.n5(var1, var2);
   }

   @Override
   public void k5(String var1) {
      this.u3 = true;
      super.k5(var1);
   }

   @Override
   public void n5(char var1) {
      this.u3 = true;
      super.n5(var1);
   }

   @Override
   public void n5(char var1, char var2) {
      this.u3 = true;
      super.n5(var1, var2);
   }

   @Override
   public void h0(String var1) {
      this.u3 = true;
      super.h0(var1);
   }

   @Override
   public void l6(String var1) {
      this.u3 = true;
      super.l6(var1);
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.u3 = true;
      super.n5(var1, var2, var3);
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.u3 = true;
      super.a_(var1, var2, var3);
   }

   @Override
   public void c8(String var1) {
      this.u3 = true;
      super.c8(var1);
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      this.u3 = true;
      super.n5(var1, var2, var3);
   }

   private void n5(y7 var1) {
      this.n5 = 0;
      this.k5 = var1.u9();
      this.l6 = var1.h0();
      this.i1 = new u9();
      if (super.y2) {
         if (this.l6) {
            super.n5(this.k5, "IndentChars", true);
            super.n5(this.c4, "NewLineChars", true);
         } else {
            super.n5(this.k5, "IndentChars", false);
            if (super.j5 != 0) {
               super.n5(this.c4, "NewLineChars", false);
            }
         }
      }
   }

   private void h0() {
      this.s7(super.c4);

      for (int var1 = this.n5; var1 > 0; var1--) {
         this.s7(this.k5);
      }
   }
}
