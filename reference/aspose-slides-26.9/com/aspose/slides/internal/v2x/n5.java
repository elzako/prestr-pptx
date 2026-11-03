package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class n5 extends com.aspose.slides.internal.e2l.n5 {
   private final byte[] n5 = new byte[3];
   private final byte[] l6 = new byte[8];
   private byte[] k5;

   public n5() {
   }

   public n5(String var1, byte[] var2, byte[] var3) {
      this.n5(var1);
      this.n5(var2);
      this.l6(var3);
      this.n5(false);
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, 3);
      } else {
         com.aspose.slides.ms.System.u3.n5(var1, 0, this.n5, 0, q1.l6(var1.length, 3));
         if (var1.length < 3) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var1.length, 3 - var1.length);
         }
      }

      this.n5(true);
   }

   public void n5(String var1) {
      if (var1 == null) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), 0, 8);
      } else {
         byte[] var2 = j5.e2().u3(var1);
         com.aspose.slides.ms.System.u3.n5(var2, 0, this.l6, 0, q1.l6(var2.length, 8));
         if (var2.length < 8) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), var2.length, 8 - var2.length);
         }
      }

      this.n5(true);
   }

   public void l6(byte[] var1) {
      if (this.k5 != var1) {
         this.k5 = var1;
         this.n5(true);
      }
   }

   @Override
   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.writeByte((byte)33);
      var1.writeByte((byte)-1);
      var1.writeByte((byte)11);
      var1.write(this.l6, 0, 8);
      var1.write(this.n5, 0, 3);
      com.aspose.slides.internal.e2l.a6.n5(this.k5, var1);
   }
}
