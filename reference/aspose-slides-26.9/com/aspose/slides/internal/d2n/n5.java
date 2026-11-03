package com.aspose.slides.internal.d2n;

import com.aspose.slides.internal.c4t.s7;
import java.awt.Color;

public class n5 {
   int n5;
   Color l6;
   int k5;
   public static final n5 u3 = new n5();

   public n5() {
   }

   public n5(int var1, Color var2, int var3) {
      this.k5 = var1;
      this.l6 = var2;
      this.n5 = var3;
   }

   public com.aspose.slides.internal.c4t.u3 n5() {
      if (this.n5 == 0) {
         return new s7(this.l6);
      } else {
         return this.n5 == 1 ? new s7(null) : new com.aspose.slides.internal.c4t.a6(this.k5, this.l6);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != null && obj instanceof n5) {
         n5 var2 = (n5)obj;
         if (this.n5 != var2.n5) {
            return false;
         } else if (this.l6 != var2.l6) {
            return false;
         } else {
            return this.l6 != null && this.l6.equals(var2.l6) ? this.k5 == var2.k5 : false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 31 + (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 13 + this.k5;
   }

   public n5(Color var1) {
      this.l6 = var1;
      this.n5 = 0;
      this.k5 = 0;
   }

   public int n5(byte[] var1, int var2) {
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      return 8;
   }

   public int l6(byte[] var1, int var2) {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      return 12;
   }

   public Color l6() {
      return this.l6;
   }

   public int k5() {
      return this.n5;
   }

   static {
      u3.n5 = 1;
      u3.l6 = Color.black;
      u3.k5 = 0;
   }
}
