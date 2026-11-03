package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class m3 implements m1 {
   private boolean n5 = false;
   private String l6;
   private l6 k5;
   private List<m1> u3 = null;

   public m3(String var1, l6 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public final boolean k5() {
      return this.n5;
   }

   @Override
   public final String[] u3() {
      return new String[]{this.l6};
   }

   @Override
   public final void n5(String var1, List<o5> var2) {
      this.n5(var1, (o5)var2.get_Item(0));
   }

   public final void n5(String var1, o5 var2) {
      if (d1.a6(this.l6, var1) && var2 != null) {
         this.n5 = true;
         if (this.k5 != null) {
            s3$k5 var3 = new s3$k5(var2.h0(), this.l6);
            this.k5.n5(1, var3);
            this.k5 = null;
         }

         this.l6(var1, var2);
      }
   }

   public final void n5(m1 var1) {
      if (this.u3 == null) {
         this.u3 = new List<>();
      }

      this.u3.addItem(var1);
   }

   private void l6(String var1, o5 var2) {
      if (this.u3 != null) {
         List var3 = new List();
         var3.addItem(var2);
         List$Enumerator var4 = this.u3.iterator();

         try {
            while (var4.hasNext()) {
               m1 var5 = (m1)var4.next();
               var5.n5(var1, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }
}
