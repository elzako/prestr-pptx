package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.p3;

@j3
public class k5 extends com.aspose.slides.internal.v6g.h0<k5> {
   private static final k5 l6 = new k5();
   private boolean k5;
   private long u3;
   // $VF: synthetic field
   static final boolean n5 = !k5.class.desiredAssertionStatus();

   public k5() {
   }

   private k5(long var1) {
      this.u3 = var1;
      this.k5 = true;
   }

   public byte n5() {
      return (byte)(this.u3 >> 24 & 255L);
   }

   public byte l6() {
      return (byte)(this.u3 >> 16 & 255L);
   }

   public byte k5() {
      return (byte)(this.u3 >> 8 & 255L);
   }

   public byte u3() {
      return (byte)(this.u3 >> 0 & 255L);
   }

   public static k5 n5(int var0, int var1, int var2, int var3) {
      n5(var0, "cyan");
      n5(var1, "magenta");
      n5(var2, "yellow");
      n5(var3, "black");
      return new k5(l6(var0, var1, var2, var3));
   }

   @Override
   public int hashCode() {
      return p3.n5(this.u3) ^ com.aspose.slides.ms.System.n3.n5(this.k5);
   }

   private static void n5(int var0, String var1) {
      if (var0 < 0 || var0 > 255) {
         throw new ArgumentOutOfRangeException("name");
      }
   }

   private static long l6(int var0, int var1, int var2, int var3) {
      return (var0 << 24 | var1 << 16 | var2 << 8 | var3 << 0) & 4294967295L;
   }

   public void n5(k5 var1) {
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public k5 a6() {
      k5 var1 = new k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean l6(k5 var1) {
      return var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
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
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
