package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.Exception;

public abstract class i1 extends v0 {
   private int n5;
   private final boolean l6;

   protected i1(int var1, j8 var2, boolean var3) {
      super(var2);
      this.n5 = var1;
      this.l6 = var3;
   }

   public final boolean t9() {
      return this.l6;
   }

   public final int z1() {
      return this.n5;
   }

   public int t4() {
      throw new Exception("Element is not a penalty");
   }

   public int q0() {
      throw new Exception("Element is not a glue");
   }

   public int z3() {
      throw new Exception("Element is not a glue");
   }

   @Override
   public boolean m1() {
      return false;
   }
}
