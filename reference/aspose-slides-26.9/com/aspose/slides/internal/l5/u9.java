package com.aspose.slides.internal.l5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;

public abstract class u9 implements IDisposable {
   public static u9 n5(c8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException();
      } else {
         return var0.s7();
      }
   }

   public abstract void n5(c8 var1, y1 var2, y1 var3, int var4);

   public abstract void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7);

   public abstract void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, t2 var8);

   public abstract void n5(n3 var1, com.aspose.slides.internal.x4g.s7 var2);

   public abstract void n5(l6 var1, com.aspose.slides.internal.x4g.s7 var2);

   public abstract void n5(l6 var1, y1 var2);

   public abstract void n5(m1 var1, int var2);

   public abstract a0 l6();

   public abstract void l6(a0 var1);

   public abstract void n5(y1 var1, int var2);

   public abstract void n5(a0 var1, int var2);

   public abstract int k5();

   public abstract void n5(int var1);

   public abstract int u3();

   public abstract void l6(int var1);

   public abstract void k5(int var1);

   public abstract m1 a6();

   public abstract void n5(m1 var1);
}
