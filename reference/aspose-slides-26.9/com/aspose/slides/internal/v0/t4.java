package com.aspose.slides.internal.v0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;

public abstract class t4 implements t9 {
   private long l6 = 0L;
   protected y4 n5;
   private List<Character> k5;

   public abstract String n5();

   public abstract int n5(int var1);

   protected final void u9() {
      this.l6++;
   }

   public abstract boolean n5(char var1);

   @Override
   public abstract String l6();

   public abstract String k5();

   public final void n5(y4 var1) {
      this.n5 = var1;
   }

   protected final void u9(int var1) {
      if (this.k5 == null) {
         this.k5 = new List<>();
      }

      if (this.k5.size() < 8 && !this.k5.containsItem((char)var1)) {
         this.k5.addItem((char)var1);
         if (this.n5 != null) {
            this.n5.n5(this, (char)var1, this.l6());
         }
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5('{');
      var1.n5(this.k5());
      var1.n5('}');
      return var1.toString();
   }
}
