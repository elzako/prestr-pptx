package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;

public final class m1 extends z3 {
   private com.aspose.slides.internal.x8w.q0 k5;
   private boolean u3;
   private boolean a6;
   private boolean u9 = true;
   private boolean h0;
   private com.aspose.slides.internal.x8w.y4 c8;

   public m1() {
      this(1024, null);
   }

   public m1(t9 var1) {
      this(1024, var1);
   }

   public m1(int var1) {
      this(var1, null);
   }

   public m1(int var1, t9 var2) {
      this.l6 = new e5[1];
      this.l6[0] = new e5(512, 1024, 64);
      this.n5(var1);
      this.c8 = new com.aspose.slides.internal.x8w.y4(var1);
      this.c8.k5.l6(new k7(this));
      this.u3 = var2 != null;
      if (var2 == null) {
         var2 = new t9(13);
         this.k5 = new com.aspose.slides.internal.x8w.q0(var2);
      } else {
         this.k5 = new com.aspose.slides.internal.x8w.q0(var2);
         this.k5.k5();
         if (this.k5.l6() != null) {
            this.a6 = true;
            this.l6(this.k5.l6());
         }
      }
   }

   @Override
   public int n5() {
      return this.c8.n5();
   }

   public boolean u3() {
      return this.c8.u3();
   }

   @Override
   public m3 l6(boolean var1) {
      if (var1 && !this.u9) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Cannot export private key"));
      } else {
         return this.c8.l6(var1);
      }
   }

   @Override
   public void l6(m3 var1) {
      this.c8.l6(var1.n5());
   }

   @Override
   public byte[] n5(byte[] var1) {
      return this.c8.n5(var1);
   }

   @Override
   public boolean n5(byte[] var1, byte[] var2) {
      return this.c8.n5(var1, var2);
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.h0) {
         if (this.a6 && !this.u3) {
            this.k5.a6();
         }

         if (this.c8 != null) {
            this.c8.l6();
         }

         this.h0 = true;
      }
   }

   private void n5(Object var1, com.aspose.slides.ms.System.f2 var2) {
      if (this.u3 && !this.a6) {
         this.k5.n5(this.k5(!this.c8.u3()));
         this.k5.u3();
         this.a6 = true;
      }
   }

   // $VF: synthetic method
   static void n5(m1 var0, Object var1, com.aspose.slides.ms.System.f2 var2) {
      var0.n5(var1, var2);
   }
}
