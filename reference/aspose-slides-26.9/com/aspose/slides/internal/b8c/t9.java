package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;

public final class t9 {
   public y4 n5;
   public x7 l6;
   public ArrayList k5;
   public Hashtable u3;
   public Hashtable a6;
   private int u9;

   public final int n5() {
      return this.u9;
   }

   public t9(y4 var1) {
      this.n5 = var1;
      this.u9 = var1.k5().length;
      this.k5 = new ArrayList();
      this.l6 = new x7(var1.l6(), this);
      if (this.n5.n5() != 2) {
         this.u3 = new Hashtable();
      }
   }
}
