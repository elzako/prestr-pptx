package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.Xml.k6;

public class f2 {
   private k6 n5;
   private int l6;
   private int k5;
   private ArrayList u3;

   public f2(k6 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = null;
   }

   public final k6 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.x6s.a6 var1, Hashtable var2) {
      if (this.u3 == null) {
         this.u3 = new ArrayList();
      }

      this.u3.addItem(new j5(var1, var2));
   }

   public final Hashtable n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (this.u3 != null) {
         for (int var2 = 0; var2 < this.u3.size(); var2++) {
            if (com.aspose.slides.internal.v6g.k5.u3(this.u3.get_Item(var2), j5.class).n5().l6(var1)) {
               return com.aspose.slides.internal.v6g.k5.u3(this.u3.get_Item(var2), j5.class).l6();
            }
         }
      }

      return null;
   }

   public final f2 u3() {
      return new f2(this.n5, this.l6, this.k5);
   }
}
