package com.aspose.slides.internal.q8o;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.internal.y4g.i1;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.ms.System.y4;

public class l6 extends com.aspose.slides.internal.n4m.n5 {
   public l6(v8 var1) {
      super(var1, (byte)15);
   }

   @Override
   public void c8() {
      super.c8();
      this.a6();
   }

   @Override
   protected void t2() {
      com.aspose.slides.internal.o8m.a6 var1 = null;
      com.aspose.slides.internal.y4g.z6 var2 = (com.aspose.slides.internal.y4g.z6)this.x8();
      var1 = var2.n5().l6(var2.n3().k5(), var2.n3().n5());
      if (var1 == null) {
         throw new com.aspose.slides.internal.y4g.n5((byte)90, "Client certificate Private Key unavailable.");
      }

      i1 var3 = new i1(var2.w1());
      var3.n5(var2.q0().u9(), 0, com.aspose.slides.internal.v6g.k5.u3(var2.q0().getLength(), 11));
      byte[] var4 = null;
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, e9.class)) {
         try {
            var4 = var3.n5((z6)var1);
         } catch (NotImplementedException var6) {
         }
      }

      if (var4 == null) {
         z6 var5 = this.n5((z6)var1);
         var4 = var3.n5(var5);
      }

      this.n5(com.aspose.slides.internal.v6g.k5.l6(var4.length, 9));
      this.write(var4, 0, var4.length);
   }

   @Override
   protected void s7() {
      com.aspose.slides.internal.o8m.a6 var1 = null;
      com.aspose.slides.internal.y4g.z6 var2 = (com.aspose.slides.internal.y4g.z6)this.x8();
      var1 = var2.n5().l6(var2.n3().k5(), var2.n3().n5());
      if (var1 == null) {
         throw new com.aspose.slides.internal.y4g.n5((byte)90, "Client certificate Private Key unavailable.");
      }

      com.aspose.slides.internal.x8w.a6 var3 = new com.aspose.slides.internal.x8w.a6();
      var3.k5(var2.q0().u9(), 0, com.aspose.slides.internal.v6g.k5.u3(var2.q0().getLength(), 11));
      byte[] var4 = null;
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, e9.class)) {
         try {
            var4 = var3.n5((z6)var1);
         } catch (NotImplementedException var6) {
         }
      }

      if (var4 == null) {
         z6 var5 = this.n5((z6)var1);
         var4 = var3.n5(var5);
      }

      this.n5(com.aspose.slides.internal.v6g.k5.l6(var4.length, 9));
      this.write(var4, 0, var4.length);
   }

   private z6 n5(z6 var1) {
      j4 var2 = new j4();
      j4 var3 = var1.l6(true).n5();
      com.aspose.slides.internal.x8w.l6 var4 = new com.aspose.slides.internal.x8w.l6(this.x8().n3().l6().l6(0).s7());
      com.aspose.slides.internal.x8w.l6 var5 = var4.n5(0);
      if (var5 != null && com.aspose.slides.internal.v6g.k5.u3(var5.l6(), 6) == 2) {
         com.aspose.slides.internal.x8w.l6 var6 = var4.n5(1);
         if (com.aspose.slides.internal.v6g.k5.u3(var6.l6(), 6) != 2) {
            return null;
         }

         var2.h0 = this.l6(var5.u3());
         var2.c8 = var6.u3();
         var2.k5 = var3.k5;
         var2.u3 = var3.u3;
         var2.a6 = var3.a6;
         var2.u9 = var3.u9;
         var2.n5 = var3.n5;
         var2.l6 = var3.l6;
         int var7 = var2.h0.length << 3;
         com.aspose.slides.internal.x8w.u9 var8 = new com.aspose.slides.internal.x8w.u9(var7);
         var8.n5(var2.n5());
         return var8;
      } else {
         return null;
      }
   }

   private byte[] l6(byte[] var1) {
      if (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) == 0) {
         int var2 = var1.length - 1;
         byte[] var3 = new byte[var2];
         y4.n5(var1, 1, var3, 0, var2);
         return var3;
      } else {
         return var1;
      }
   }
}
