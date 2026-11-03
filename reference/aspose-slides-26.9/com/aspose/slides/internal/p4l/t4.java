package com.aspose.slides.internal.p4l;

import java.lang.reflect.Type;

public abstract class t4 extends e2 {
   z3[] u3() {
      return this.a6();
   }

   public abstract z3[] a6();

   abstract Type[] u9();

   abstract Type h0();

   public Object n5(Object var1, Object[] var2) {
      return this.n5(var1, 0, null, var2, null);
   }

   public abstract Object n5(Object var1, int var2, l6 var3, Object[] var4, com.aspose.slides.internal.x7n.l6 var5);

   protected t4() {
   }

   public abstract int c8();

   public int n3() {
      return 1;
   }

   public boolean y4() {
      return (this.c8() & 7) == 6;
   }

   public boolean e2() {
      return (this.c8() & 16) != 0;
   }

   public boolean t9() {
      return (this.c8() & 64) != 0;
   }

   public boolean z1() {
      return (this.c8() & 1024) != 0;
   }

   public boolean t4() {
      return (this.c8() & 2048) != 0;
   }

   public boolean q0() {
      return false;
   }

   public boolean z3() {
      return false;
   }
}
