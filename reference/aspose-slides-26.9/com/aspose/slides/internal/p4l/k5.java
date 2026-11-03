package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.y8;
import java.lang.reflect.Constructor;

public abstract class k5 extends t4 {
   public static String n5 = ".ctor";
   public static String l6 = ".cctor";

   protected k5() {
   }

   public abstract Constructor n5();

   @Override
   public int l6() {
      return 1;
   }

   @Override
   public y8 k5() {
      throw new NotImplementedException();
   }

   public Object n5(Object[] var1) {
      return this.n5(0, null, var1, null);
   }

   public abstract Object n5(int var1, l6 var2, Object[] var3, com.aspose.slides.internal.x7n.l6 var4);
}
