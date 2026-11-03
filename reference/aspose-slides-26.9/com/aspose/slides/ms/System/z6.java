package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.NotImplementedException;

public abstract class z6 extends a0 {
   @Override
   public final a0[] getInvocationList() {
      throw new NotImplementedException();
   }

   @Override
   protected a0 combineImpl(a0 d) {
      throw new NotImplementedException();
   }

   @Override
   protected final a0 removeImpl(a0 value) {
      throw new NotImplementedException();
   }

   public String getDelegateId() {
      return null;
   }

   public static boolean op_Equality(z6 d1, z6 d2) {
      if (d1 == null) {
         return d2 == null;
      }

      String var2 = d1.getDelegateId();
      return var2 != null && d2 != null && d2.getDelegateId() != null ? var2.equals(d2.getDelegateId()) : d1.equals(d2);
   }

   public static boolean op_Inequality(z6 d1, z6 d2) {
      if (d1 == null) {
         return d2 != null;
      }

      String var2 = d1.getDelegateId();
      return var2 != null && d2 != null && d2.getDelegateId() != null ? !var2.equals(d2.getDelegateId()) : !d1.equals(d2);
   }
}
