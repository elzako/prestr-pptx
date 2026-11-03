package com.aspose.slides.internal.o8m;

import java.util.Arrays;

@com.aspose.slides.ms.System.j3
public class m3 extends com.aspose.slides.internal.v6g.h0<m3> {
   public int n5;
   public byte[] l6;
   public byte[] k5;
   public byte[] u3;
   public byte[] a6;
   public byte[] u9;
   @com.aspose.slides.ms.System.e9
   public byte[] h0;
   public byte[] c8;
   // $VF: synthetic field
   static final boolean t2 = !m3.class.desiredAssertionStatus();

   public void n5(m3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
   }

   public m3 n5() {
      m3 var1 = new m3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(m3 var1) {
      return var1.n5 == this.n5
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6)
         && com.aspose.slides.ms.System.j8.n5(var1.u9, this.u9)
         && com.aspose.slides.ms.System.j8.n5(var1.h0, this.h0)
         && com.aspose.slides.ms.System.j8.n5(var1.c8, this.c8);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof m3) ? false : this.l6((m3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = 31 * var1 + (this.l6 != null ? Arrays.hashCode(this.l6) : 0);
      var1 = 31 * var1 + (this.k5 != null ? Arrays.hashCode(this.k5) : 0);
      var1 = 31 * var1 + (this.u3 != null ? Arrays.hashCode(this.u3) : 0);
      var1 = 31 * var1 + (this.a6 != null ? Arrays.hashCode(this.a6) : 0);
      var1 = 31 * var1 + (this.u9 != null ? Arrays.hashCode(this.u9) : 0);
      var1 = 31 * var1 + (this.h0 != null ? Arrays.hashCode(this.h0) : 0);
      return 31 * var1 + (this.c8 != null ? Arrays.hashCode(this.c8) : 0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(m3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
