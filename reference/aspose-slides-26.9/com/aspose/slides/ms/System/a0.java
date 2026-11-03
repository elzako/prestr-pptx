package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.MulticastNotSupportedException;

public abstract class a0 {
   private Object a;
   private RuntimeException b;
   private Object[] c;

   public a0[] getInvocationList() {
      return new a0[]{this};
   }

   public static a0 combine(a0 a, a0 b) {
      if (a == null) {
         return b == null ? null : b;
      } else if (b == null) {
         return a;
      } else if (j8.n5(a) != j8.n5(b)) {
         throw new ArgumentException(d1.n5("Incompatible Delegate Types. First is {0} second is {1}.",new Object[]{ j8.n5(a).q0(), j8.n5(b).q0()}));
      } else {
         return a.combineImpl(b);
      }
   }

   public static a0 combine(a0... delegates) {
      if (delegates == null) {
         return null;
      }

      a0 var1 = null;

      for (a0 var5 : delegates) {
         var1 = combine(var1, var5);
      }

      return var1;
   }

   protected a0 combineImpl(a0 d) {
      throw new MulticastNotSupportedException(d1.n5);
   }

   public static a0 remove(a0 source, a0 value) {
      if (source == null) {
         return null;
      } else if (value == null) {
         return source;
      } else if (j8.n5(source) != j8.n5(value)) {
         throw new ArgumentException(d1.n5("Incompatible Delegate Types. First is {0} second is {1}.",new Object[]{ j8.n5(source).q0(), j8.n5(value).q0()}));
      } else {
         return source.removeImpl(value);
      }
   }

   protected a0 removeImpl(a0 d) {
      return this.equals(d) ? null : this;
   }

   public static a0 removeAll(a0 source, a0 value) {
      a0 var2 = source;

      while (op_Inequality(source = remove(source, value), var2)) {
         var2 = source;
      }

      return var2;
   }

   protected void pushResult(Object result) {
      this.a = result;
   }

   protected void pushOutRefParams(Object... params) {
      this.c = params;
   }

   public Object peekOutRefParam(int pos) {
      return this.c[pos];
   }

   public Object peekResult() {
      return this.a;
   }

   public void setException(RuntimeException exception) {
      this.b = exception;
   }

   public void throwException() {
      if (this.b != null) {
         throw this.b;
      }
   }

   public static boolean op_Equality(a0 d1, a0 d2) {
      if (d1 == null) {
         return d2 == null;
      } else {
         return d2 == null ? false : d1.equals(d2);
      }
   }

   public static boolean op_Inequality(a0 d1, a0 d2) {
      return !op_Equality(d1, d2);
   }
}
