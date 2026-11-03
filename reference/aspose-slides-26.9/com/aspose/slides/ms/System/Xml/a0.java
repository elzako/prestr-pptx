package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;

public class a0 implements com.aspose.slides.ms.System.v4 {
   private Object[] n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public a0(int var1) {
      this(var1, Integer.MAX_VALUE);
   }

   public a0(int var1, int var2) {
      this.l6 = var1;
      this.k5 = 0;
      this.n5 = new Object[var1];
      this.u3 = var1;
      this.a6 = var2;
   }

   public final Object n5() {
      if (this.k5 == this.u3) {
         if (this.a6 <= this.k5) {
            throw new XmlException("Stack overflow.", com.aspose.slides.ms.System.d1.n5);
         }

         Object[] var1 = new Object[this.u3 + this.l6];
         if (this.k5 > 0) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, this.k5);
         }

         this.n5 = var1;
         this.u3 = this.u3 + this.l6;
      }

      return this.n5[this.k5++];
   }

   public final Object l6() {
      if (0 < this.k5) {
         this.k5--;
         return this.n5[this.k5];
      } else {
         return null;
      }
   }

   public final Object k5() {
      return this.k5 > 0 ? this.n5[this.k5 - 1] : null;
   }

   public final void n5(Object var1) {
      if (this.k5 > 0) {
         this.n5[this.k5 - 1] = var1;
      }
   }

   public final Object n5(int var1) {
      if (var1 >= 0 && var1 < this.k5) {
         return this.n5[var1];
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final void n5(int var1, Object var2) {
      if (var1 >= 0 && var1 < this.k5) {
         this.n5[var1] = var2;
      } else {
         throw new IndexOutOfRangeException();
      }
   }

   public final int u3() {
      return this.k5;
   }

   private a0(Object[] var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final Object deepClone() {
      return new a0(com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).deepClone(), Object[].class), this.l6, this.k5, this.u3);
   }
}
