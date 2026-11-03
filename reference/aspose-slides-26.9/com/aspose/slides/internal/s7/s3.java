package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class s3 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "border-radius";
   }

   @Override
   public int l6() {
      return 51;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      IGenericList var5 = new List();
      IGenericList var6 = new List();
      IGenericList var7 = com.aspose.slides.internal.z8.n5.n5(var3);
      IGenericList var8 = var5;
      IGenericEnumerator var9 = var7.iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.z8.y4 var10 = (com.aspose.slides.internal.z8.y4)var9.next();
            if (var10.n5() == 4) {
               if (var8 == var6) {
                  throw this.n5(var10.n5());
               }

               var8 = var6;
            } else {
               var8.addItem(var10);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      var5 = this.n5(var5, com.aspose.slides.internal.z8.y4.class);
      if (var6.size() != 0) {
         var6 = this.n5(var6, com.aspose.slides.internal.z8.y4.class);
      }

      if (var6.size() != 0) {
         this.n5(
            var2,
            "border-top-left-radius",
            com.aspose.slides.ms.System.u3.n5(
               new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(0), (com.aspose.slides.internal.z8.y4)var6.get_Item(0)}
            ),
            var4
         );
         this.n5(
            var2,
            "border-top-right-radius",
            com.aspose.slides.ms.System.u3.n5(
               new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(1), (com.aspose.slides.internal.z8.y4)var6.get_Item(1)}
            ),
            var4
         );
         this.n5(
            var2,
            "border-bottom-right-radius",
            com.aspose.slides.ms.System.u3.n5(
               new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(2), (com.aspose.slides.internal.z8.y4)var6.get_Item(2)}
            ),
            var4
         );
         this.n5(
            var2,
            "border-bottom-left-radius",
            com.aspose.slides.ms.System.u3.n5(
               new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(3), (com.aspose.slides.internal.z8.y4)var6.get_Item(3)}
            ),
            var4
         );
      } else {
         this.n5(
            var2,
            "border-top-left-radius",
            com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(0)}),
            var4
         );
         this.n5(
            var2,
            "border-top-right-radius",
            com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(1)}),
            var4
         );
         this.n5(
            var2,
            "border-bottom-right-radius",
            com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(2)}),
            var4
         );
         this.n5(
            var2,
            "border-bottom-left-radius",
            com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.z8.y4[]{(com.aspose.slides.internal.z8.y4)var5.get_Item(3)}),
            var4
         );
      }
   }
}
