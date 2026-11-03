package com.aspose.slides.internal.l6;

import java.util.ArrayList;
import java.util.List;

public abstract class t2 {
   protected int n5 = 0;
   protected Object l6;
   protected List k5;
   protected boolean u3 = false;
   protected String a6;
   protected y4 u9;

   public t2(y4 var1, String var2) {
      this.a6 = var2;
      this.u9 = var1;
   }

   public t2(y4 var1, String var2, Object var3) {
      this(var1, var2);
      this.n5(var3);
   }

   public void n5() {
      this.n5 = 0;
      this.u3 = true;
   }

   public void n5(Object var1) {
      if (var1 != null) {
         if (this.k5 != null) {
            this.k5.add(var1);
         } else if (this.l6 == null) {
            this.l6 = var1;
         } else {
            this.k5 = new ArrayList(5);
            this.k5.add(this.l6);
            this.l6 = null;
            this.k5.add(var1);
         }
      }
   }

   public Object l6() {
      int var1 = this.a6();
      if (!this.u3 && (this.n5 < var1 || var1 != 1)) {
         return this.k5();
      }

      Object var2 = this.k5();
      return this.l6(var2);
   }

   protected Object k5() {
      int var1 = this.a6();
      if (var1 == 0) {
         throw new c8(this.a6);
      }

      if (this.n5 >= var1) {
         if (var1 == 1) {
            return this.k5(this.l6);
         } else {
            throw new u9(this.a6);
         }
      } else if (this.l6 != null) {
         this.n5++;
         return this.k5(this.l6);
      } else {
         Object var2 = this.k5(this.k5.get(this.n5));
         this.n5++;
         return var2;
      }
   }

   protected abstract Object l6(Object var1);

   protected Object k5(Object var1) {
      return var1;
   }

   public boolean u3() {
      return this.l6 != null && this.n5 < 1 || this.k5 != null && this.n5 < this.k5.size();
   }

   public int a6() {
      byte var1 = 0;
      if (this.l6 != null) {
         var1 = 1;
      }

      return this.k5 != null ? this.k5.size() : var1;
   }
}
