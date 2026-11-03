package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

class e9 extends h0 {
   public e9(com.aspose.slides.internal.z0k.t4 var1, z6 var2) {
      super(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.n4m.n5 n5(byte var1) {
      return this.u3(var1);
   }

   @Override
   protected void n5(h2 var1) {
      byte var2 = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.l6()), 6);
      com.aspose.slides.internal.n4m.n5 var3 = null;
      int var4 = var1.u3();
      byte[] var5 = null;
      if (var4 > 0) {
         var5 = new byte[var4];
         var1.read(var5, 0, var4);
      }

      var3 = this.k5(var2, var5);
      if (var3 != null) {
         var3.e2();
      }

      this.n5().n5(var2);
      if (var3 != null) {
         var3.c8();
         this.n5().q0().writeByte(var2);
         this.n5().q0().l6(var4);
         if (var4 > 0) {
            this.n5().q0().write(var5, 0, var5.length);
         }
      }
   }

   private com.aspose.slides.internal.n4m.n5 u3(byte var1) {
      switch (var1) {
         case 1:
            return new com.aspose.slides.internal.q8o.u3(this.l6);
         case 11:
            return new com.aspose.slides.internal.q8o.n5(this.l6);
         case 15:
            return new com.aspose.slides.internal.q8o.l6(this.l6);
         case 16:
            return new com.aspose.slides.internal.q8o.a6(this.l6);
         case 20:
            return new com.aspose.slides.internal.q8o.k5(this.l6);
         default:
            throw new InvalidOperationException(
               d1.n5(new String[]{"Unknown client handshake message type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.n4m.l6.class, var1)})
            );
      }
   }

   private com.aspose.slides.internal.n4m.n5 k5(byte var1, byte[] var2) {
      z6 var3 = (z6)this.l6;
      switch (var1) {
         case 0:
            if (var3.e2() != 1) {
               var3.k5(0);
            } else {
               this.n5((byte)1, (byte)100);
            }

            return null;
         case 1:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            throw new n5(
               (byte)10,
               d1.n5(
                  com.aspose.slides.internal.x7n.l6.l6(),
                  "Unknown server handshake message received ({0})",
                  com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.n4m.l6.class, var1)
               )
            );
         case 2:
            return new com.aspose.slides.internal.q8o.t2(this.l6, var2);
         case 11:
            return new com.aspose.slides.internal.q8o.u9(this.l6, var2);
         case 12:
            return new com.aspose.slides.internal.q8o.x8(this.l6, var2);
         case 13:
            return new com.aspose.slides.internal.q8o.h0(this.l6, var2);
         case 14:
            return new com.aspose.slides.internal.q8o.s7(this.l6, var2);
         case 20:
            return new com.aspose.slides.internal.q8o.c8(this.l6, var2);
      }
   }
}
