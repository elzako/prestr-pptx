package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w1 extends z7 {
   private int l6 = 0;

   private w1(a5 var1) {
      this.n5(var1);
   }

   private w1() {
   }

   @Override
   public void n5(a5 var1) {
      if (var1.t_() != null) {
         List var2 = var1.t_();
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               a5 var4 = (a5)var3.next();
               this.n5.addItem(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } else {
         super.n5(var1);
      }
   }

   @Override
   public String j_() {
      if (this.n5.size() > 0) {
         a5 var1 = this.n5.get_Item(0);
         return var1.j_();
      } else {
         return super.j_();
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      w1 var2 = com.aspose.slides.internal.v6g.k5.n5(o, w1.class);
      return var2 == null ? false : this.n5 != null && this.n5.equals(var2.n5);
   }

   @Override
   public int hashCode() {
      if (this.l6 == 0) {
         int var1 = 17;
         List$Enumerator var2 = this.n5.iterator();

         try {
            while (var2.hasNext()) {
               a5 var3 = (a5)var2.next();
               var1 = 37 * var1 + (var3 == null ? 0 : var3.hashCode());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.l6 = var1;
      }

      return this.l6;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/h2/w1$1;)V -> ()V
   w1(com.aspose.slides.internal.h2.w1$1 recoveredArg0) {
      this();
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/h2/a5;Lcom/aspose/slides/internal/h2/w1$1;)V -> (Lcom/aspose/slides/internal/h2/a5;)V
   w1(com.aspose.slides.internal.h2.a5 recoveredArg0, com.aspose.slides.internal.h2.w1$1 recoveredArg1) {
      this(recoveredArg0);
   }
}
