package com.aspose.slides.internal.s7k;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class t2 {
   private boolean n5;
   private int l6;
   private ArrayList k5;
   private float[] u3;
   private float[] a6;
   private float[] u9;

   public t2() {
      this(true, 1061109567);
   }

   public t2(boolean var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new ArrayList();
      this.u3 = new float[3];
      this.a6 = new float[3];
      this.u9 = new float[3];
   }

   public t2(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      this(true, 1061109567);
      this.n5(var1);
      this.n5(var2);
   }

   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      q0 var2 = new q0();
      var2.n5(var1);
      this.n5(var2);
      var2.n5();
   }

   public void n5(q0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("profile");
      }

      int var2 = var1.l6().u3;
      if (var2 != 1935896178 && var2 != 1835955314 && var2 != 1886549106) {
         throw new NotSupportedException(d1.n5("Type of profile {0} is not supported", new Object[]{d2.a6(var2)}));
      }

      int var3;
      int var4;
      if (this.n5) {
         var3 = var1.l6().a6;
         var4 = var1.l6().u9;
      } else {
         var3 = var1.l6().u9;
         var4 = var1.l6().a6;
      }

      if (this.l6 == 1061109567) {
         if (this.n5) {
            this.l6 = var1.l6().e2;
         }

         if (this.l6 == 1061109567) {
            this.l6 = 0;
         }
      }

      if (this.k5.size() > 0 && !d2.n5(((d5)this.k5.get_Item(this.k5.size() - 1)).k5(), var3)) {
         throw new u3();
      }

      if (this.k5.size() == 0 && this.a6.length != com.aspose.slides.internal.v6g.k5.u3(d2.k5(var3), 6)) {
         this.a6 = new float[d2.k5(var3)];
      }

      if (this.u9.length != com.aspose.slides.internal.v6g.k5.u3(d2.k5(var4), 6)) {
         this.u9 = new float[d2.k5(var4)];
      }

      if (this.u3.length < q1.n5(this.a6.length, this.u9.length)) {
         this.u3 = new float[q1.n5(this.a6.length, this.u9.length)];
      }

      d5 var5 = d5.n5(var1, this.n5, this.l6);
      var5.n5();
      this.k5.addItem(var5);
      this.n5 = !this.n5;
   }

   public void n5(float[] var1, float[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("srcPixel");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dstPixel");
      }

      if (this.k5.size() == 0) {
         System.arraycopy(var1, 0, var2, 0, var1.length);
      } else {
         if (var1.length != this.a6.length) {
            throw new y4();
         }

         if (var2.length != this.u9.length) {
            throw new y4();
         }

         System.arraycopy(var1, 0, this.u3, 0, var1.length);
         d5 var3 = null;

         for (Object recoveredElement$var5$3150 : this.k5) {
            d5 var5 = (d5)recoveredElement$var5$3150;
            t4.n5(this.u3, var3, var5);
            var5.n5(this.u3);
            var3 = var5;
         }

         t4.n5(this.u3, var3);
         System.arraycopy(this.u3, 0, var2, 0, var2.length);
      }
   }

   public void n5(double[] var1, double[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("srcPixel");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dstPixel");
      }

      if (this.k5.size() == 0) {
         System.arraycopy(var1, 0, var2, 0, var1.length);
      } else {
         if (var1.length != this.a6.length) {
            throw new y4();
         }

         if (var2.length != this.u9.length) {
            throw new y4();
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            this.a6[var3] = (float)var1[var3];
         }

         this.n5(this.a6, this.u9);

         for (int var4 = 0; var4 < var2.length; var4++) {
            var2[var4] = this.u9[var4];
         }
      }
   }

   public int n5() {
      return this.u9.length;
   }
}
