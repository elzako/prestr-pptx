package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;

public final class e9 extends z6 {
   private com.aspose.slides.internal.x8w.q0 k5;
   private boolean u3;
   private boolean a6;
   private boolean u9 = true;
   private boolean h0;
   private com.aspose.slides.internal.x8w.u9 c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "1.3.14.3.2.26", "1.2.840.113549.2.5", "2.16.840.1.101.3.4.2.1", "2.16.840.1.101.3.4.2.2", "2.16.840.1.101.3.4.2.3"
   );

   public e9() {
      this.n5(1024, null);
   }

   public e9(t9 var1) {
      this.n5(1024, var1);
   }

   public e9(int var1) {
      this.n5(var1, null);
   }

   private void n5(int var1, t9 var2) {
      this.l6 = new e5[1];
      this.l6[0] = new e5(384, 16384, 8);
      super.n5(var1);
      this.c8 = new com.aspose.slides.internal.x8w.u9(this.n5());
      this.c8.k5.l6(new o5(this));
      this.u3 = var2 != null;
      if (var2 == null) {
         var2 = new t9(1);
         this.k5 = new com.aspose.slides.internal.x8w.q0(var2);
      } else {
         this.k5 = new com.aspose.slides.internal.x8w.q0(var2);
         boolean var3 = this.k5.k5();
         boolean var4 = (var2.n5() & 8) != 0;
         if (var4 && !var3) {
            throw new CryptographicException("Keyset does not exist");
         }

         if (this.k5.l6() != null) {
            this.a6 = true;
            this.l6(this.k5.l6());
         }
      }
   }

   @Override
   public int n5() {
      return this.c8 == null ? this.n5 : this.c8.n5();
   }

   public boolean u3() {
      return this.c8.u3();
   }

   @Override
   public byte[] l6(byte[] var1) {
      if (!this.c8.a6()) {
         throw new CryptographicException("Incomplete private key - missing CRT.");
      } else {
         return this.c8.l6(var1);
      }
   }

   @Override
   public byte[] n5(byte[] var1) {
      return this.c8.n5(var1);
   }

   @Override
   public j4 l6(boolean var1) {
      if (var1 && !this.u9) {
         throw new CryptographicException("cannot export private key");
      } else {
         return this.c8.l6(var1);
      }
   }

   @Override
   public void n5(j4 var1) {
      this.c8.n5(var1.n5());
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
   static void n5(e9 var0, Object var1, com.aspose.slides.ms.System.f2 var2) {
      var0.n5(var1, var2);
   }
}
