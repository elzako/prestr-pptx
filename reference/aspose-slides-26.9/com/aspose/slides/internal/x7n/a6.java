package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;

@j3
public class a6 extends t4 {
   int n5;
   public static int l6 = 1;
   private static t4 k5;

   public a6() {
      this(1);
   }

   public a6(int var1) {
      if (var1 >= 1 && var1 <= 12) {
         this.n5 = var1;
      } else {
         throw new ArgumentOutOfRangeException("type");
      }
   }

   public int n5() {
      return this.n5;
   }

   @Override
   public int[] l6() {
      return new int[]{1};
   }

   @Override
   public j5 k5() {
      return j5.k5.m3();
   }

   @Override
   public j5 u3() {
      return j5.l6.m3();
   }

   @Override
   public int a6() {
      if (super.a6 == -1) {
         super.a6 = 2029;
      }

      return super.a6;
   }

   @Override
   public void n5(int var1) {
      super.c8();
      if (var1 >= 99 && var1 <= 9999) {
         super.a6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   @Override
   public int n5(j5 var1) {
      return com.aspose.slides.internal.o3n.n5.n5(var1.n3(), 3);
   }

   @Override
   public int l6(j5 var1) {
      return (int)(var1.n3() / 864000000000L + 1L) % 7;
   }

   @Override
   public int k5(j5 var1) {
      return com.aspose.slides.internal.o3n.n5.n5(var1.n3(), 1);
   }

   @Override
   public int n5(int var1, int var2) {
      if (var2 != 0 && var2 != 1) {
         throw new ArgumentOutOfRangeException("era");
      } else if (var1 >= 1 && var1 <= 9999) {
         return var1 % 4 == 0 && (var1 % 100 != 0 || var1 % 400 == 0) ? 366 : 365;
      } else {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   public static t4 u9() {
      if (k5 == null) {
         k5 = new a6();
      }

      return k5;
   }

   @Override
   public int u3(j5 var1) {
      return 1;
   }

   @Override
   public int a6(j5 var1) {
      return com.aspose.slides.internal.o3n.n5.n5(var1.n3(), 2);
   }

   @Override
   public int n5(j5 var1, int var2, int var3) {
      if (var3 >= 0 && var3 <= 6) {
         switch (var2) {
            case 0:
               return super.l6(var1, var3);
            case 1:
               return com.aspose.slides.internal.o3n.n5.n5(this, var1, var3, 7, 365);
            case 2:
               return com.aspose.slides.internal.o3n.n5.n5(this, var1, var3, 4, 365);
            default:
               throw new ArgumentOutOfRangeException("rule");
         }
      } else {
         throw new ArgumentOutOfRangeException("firstDayOfWeek");
      }
   }

   @Override
   public int u9(j5 var1) {
      return com.aspose.slides.internal.o3n.n5.n5(var1.n3(), 0);
   }

   @Override
   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var8 != 0 && var8 != 1) {
         throw new ArgumentOutOfRangeException("era");
      } else {
         return new j5(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   @Override
   public int h0() {
      return 1;
   }

   @Override
   public Object deepClone() {
      a6 var1 = new a6(this.n5());
      var1.n5(this.a6());
      return var1;
   }
}
