package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;

public abstract class j8 extends l8 {
   private byte n5;

   j8(int var1, short var2) {
      super(var1, (byte)0);
      this.w1().n5(var1);
      this.w1().n5(var2);
      this.n5((byte)-1);
   }

   public final byte l6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public static j8 n5(com.aspose.slides.internal.z0k.e2 var0) {
      return n5(var0, false, 1);
   }

   public static j8 n5(com.aspose.slides.internal.z0k.e2 var0, int var1) {
      return n5(var0, true, var1);
   }

   private static j8 n5(com.aspose.slides.internal.z0k.e2 var0, boolean var1, int var2) {
      j8 var3 = null;
      com.aspose.slides.internal.n8e.m1 var4 = new com.aspose.slides.internal.n8e.m1(var0);
      boolean var5 = true;
      if (var4.l6()) {
         int var6 = var4.n5();
         if (var6 == 0 || var6 == 1 || var6 == 2) {
            if (var6 == 0) {
               var3 = new q6();
            } else if (var6 == 2 || var6 == 1) {
               var3 = new k4();
            }

            var3.n5(var0.toArray());
            var3.l6(var3.c8());
            var3.w1().l6(var3.h0().n5().length + 1);
            var5 = false;
         }
      }

      if (var5) {
         var3 = new k4();

         try {
            var0.setPosition(0L);
            com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var0);
            if (com.aspose.slides.ms.System.o0.n5(var9.x8().n5(), com.aspose.slides.internal.j9e.x8.x8().n5())) {
               var3 = new e8();
               var3.n5(var0.toArray());
            } else {
               com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();
               var9.n5(var7, com.aspose.slides.internal.j9e.x8.s7());
               var7.close();
               var3.n5(var7.toArray());
            }

            var9.dispose();
            var3.l6(var3.c8());
            var3.w1().l6(var3.h0().n5().length + 1);
         } catch (ArgumentException var8) {
            if (!var1) {
               throw var8;
            }

            com.aspose.slides.internal.n8e.v4.n5(var8);
            switch (var2) {
               case 5:
                  var3 = new q6();
                  break;
               case 6:
                  var3 = new k4();
                  break;
               case 7:
                  var3 = new s8();
                  break;
               case 17:
                  var3 = new e8();
                  break;
               default:
                  throw new NotImplementedException();
            }

            var3.n5(var0.toArray());
            var3.l6(var3.c8());
            var3.w1().l6(var3.h0().n5().length + 1);
         }
      }

      return var3;
   }

   @Override
   public byte[] k5() {
      byte[] var1;
      if (this.t2() == 7) {
         var1 = f2.n5(this.c8());
      } else {
         var1 = this.c8();
      }

      return var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(l6(var1).k5());
      this.n5(var1.z1());
      byte var2 = 1;
      if ((this.w1().k5() & 1) > 0) {
         var1.c8(16);
         var2 += 16;
         this.w1().n5((short)(this.w1().k5() & -2));
      }

      int var3 = this.w1().a6() - 16 - var2;
      this.n5(var1.c8(var3));
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.h0().n5());
      var1.n5(this.l6());
      var1.n5(this.c8());
   }

   @Override
   public int n5() {
      return this.h0().n5().length + 1 + this.c8().length;
   }
}
