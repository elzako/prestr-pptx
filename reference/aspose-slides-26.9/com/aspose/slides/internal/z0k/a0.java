package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p8;

@j3
public abstract class a0 implements IDisposable {
   protected char[] l6 = d1.c8(p8.n5);
   h2 k5;
   public static a0 u3 = new a0$n5();

   protected a0() {
   }

   public abstract com.aspose.slides.internal.l7h.j5 l6();

   public void k5(String var1) {
      if (var1 == null) {
         var1 = p8.n5;
      }

      this.l6 = d1.c8(var1);
   }

   public void u3() {
      this.l6(true);
   }

   protected void l6(boolean var1) {
      if (var1) {
         e5.n5(this);
      }
   }

   @Override
   public void dispose() {
      this.l6(true);
      e5.n5(this);
   }

   public void k5() {
   }

   public static a0 n5(a0 var0) {
      return n5(var0, false);
   }

   static a0 n5(a0 var0, boolean var1) {
      if (var0 == null) {
         throw new ArgumentNullException("writer is null");
      } else {
         return var0 instanceof y2 ? var0 : new y2(var0, var1);
      }
   }

   public void a_(boolean var1) {
      this.n5(Boolean.toString(var1));
   }

   public void n5(char var1) {
   }

   public void n5(char[] var1) {
      if (var1 != null) {
         this.n5(var1, 0, var1.length);
      }
   }

   public void n5(int var1) {
      this.n5(Integer.toString(var1));
   }

   public void n5(Object var1) {
      if (var1 != null) {
         this.n5(var1.toString());
      }
   }

   public void n5(String var1) {
      if (var1 != null) {
         this.n5(d1.c8(var1));
      }
   }

   public void n5(String var1, Object var2) {
      this.n5(d1.n5(var1, new Object[]{var2}));
   }

   public void n5(String var1, Object... var2) {
      this.n5(d1.n5(var1, var2));
   }

   public void n5(char[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 >= 0 && var2 <= var1.length) {
         if (var3 >= 0 && var2 <= var1.length - var3) {
            while (var3 > 0) {
               this.n5(var1[var2]);
               var3--;
               var2++;
            }
         } else {
            throw new ArgumentOutOfRangeException("count");
         }
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public void n5(String var1, Object var2, Object var3) {
      this.n5(d1.n5(var1, var2, var3));
   }

   public void n5(String var1, Object var2, Object var3, Object var4) {
      this.n5(d1.n5(var1, var2, var3, var4));
   }

   public void Z_() {
      this.n5(this.l6);
   }

   public void k5(boolean var1) {
      this.a_(var1);
      this.Z_();
   }

   public void l6(int var1) {
      this.n5(var1);
      this.Z_();
   }

   public void l6(Object var1) {
      this.n5(var1);
      this.Z_();
   }

   public void l6(String var1) {
      this.n5(var1);
      this.Z_();
   }

   public void l6(String var1, Object var2) {
      this.n5(var1, var2);
      this.Z_();
   }

   public void l6(String var1, Object... var2) {
      this.n5(var1, var2);
      this.Z_();
   }

   public void l6(String var1, Object var2, Object var3) {
      this.n5(var1, var2, var3);
      this.Z_();
   }

   public void l6(String var1, Object var2, Object var3, Object var4) {
      this.n5(var1, var2, var3, var4);
      this.Z_();
   }
}
