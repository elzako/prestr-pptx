package com.aspose.slides.internal.n4m;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.y4g.h2;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.ms.System.y4;

public abstract class n5 extends h2 {
   private v8 n5;
   private byte l6;
   private byte k5;
   private byte[] u3;

   public v8 x8() {
      return this.n5;
   }

   public byte n3() {
      return this.l6;
   }

   public byte y4() {
      return this.k5;
   }

   public n5(v8 var1, byte var2) {
      this(var1, var2, (byte)22);
   }

   public n5(v8 var1, byte var2, byte var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public n5(v8 var1, byte var2, byte[] var3) {
      super(var3);
      this.n5 = var1;
      this.l6 = var2;
   }

   protected abstract void s7();

   protected abstract void t2();

   public void e2() {
      switch (this.x8().u9()) {
         case -1073741824:
         case 192:
            this.s7();
            break;
         case 12:
         default:
            throw new NotSupportedException("Unsupported security protocol type");
         case 48:
            this.t2();
      }
   }

   public void c8() {
      if (this.canWrite()) {
         if (this.u3 == null) {
            this.u3 = this.t9();
         }

         this.n5.q0().n5(this.u3);
         this.a6();
         this.u3 = null;
      }
   }

   public byte[] t9() {
      this.u3 = null;
      if (this.canWrite()) {
         byte[] var1 = this.u9();
         int var2 = var1.length;
         this.u3 = new byte[4 + var2];
         this.u3[0] = this.n3();
         this.u3[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 16), 9);
         this.u3[2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 8), 9);
         this.u3[3] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2), 9);
         y4.n5(var1, 0, this.u3, 4, var2);
      }

      return this.u3;
   }

   public static boolean n5(byte[] var0, byte[] var1) {
      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (com.aspose.slides.internal.v6g.k5.u3(var0[var2], 6) != com.aspose.slides.internal.v6g.k5.u3(var1[var2], 6)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
