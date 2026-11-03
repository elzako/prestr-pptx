package com.aspose.slides.internal.q4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.j8;

public class k5 extends h0<k5> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public boolean a6;
   public boolean u9;
   public int h0;

   public final void n5(t4 var1) {
      com.aspose.slides.internal.u0.l6.n5(var1, this.n5 & 65535);
      com.aspose.slides.internal.u0.l6.n5(var1, this.l6 & 65535);
      com.aspose.slides.internal.u0.l6.n5(var1, this.k5 & 65535);
      com.aspose.slides.internal.u0.l6.n5(var1, this.u3 & 65535);
      byte var2 = n5(this.h0);
      if (this.a6) {
         var2 = (byte)(var2 & 0xFF | 64);
      }

      if (this.u9) {
         var2 = (byte)(var2 & 0xFF | 32);
      }

      var1.writeByte(var2);
   }

   public static byte n5(int var0) {
      if (var0 >= 0 && var0 <= 256) {
         byte var1 = 0;
         if (var0 > 0) {
            int var2 = com.aspose.slides.internal.u0.k5.n5(var0) - 1;
            var2 &= 7;
            var1 = (byte)(var1 & 0xFF | var2);
            var1 = (byte)(var1 & 0xFF | 128);
         }

         return var1;
      } else {
         throw new ArgumentOutOfRangeException("size");
      }
   }

   public void n5(k5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
   }

   public k5 n5() {
      k5 var1 = new k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k5 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k5) ? false : this.l6((k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
