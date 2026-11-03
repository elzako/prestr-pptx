package com.aspose.slides.internal.r4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.z3;

public class s7 implements IDisposable {
   private Dictionary<String, t2> n5 = new Dictionary<>();

   public s7(com.aspose.slides.internal.y1.t2 var1) {
   }

   public final t2 n5(String var1, x8 var2) {
      String var3 = d1.s7(var1);
      if (this.n5.containsKey(var3)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var3), t2.class);
      }

      com.aspose.slides.internal.z0k.t4 var4 = var2.n5(var1);

      try {
         com.aspose.slides.internal.o9b.l6 var9;
         t2 var11;
         if (var4 == null) {
            String var5 = "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNgYAAAAAMAASsJTYQAAAAASUVORK5CYII=";
            String var6 = d1.n5(new String[]{"data:image/png;base64,", "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNgYAAAAAMAASsJTYQAAAAASUVORK5CYII="});
            byte[] var7 = z3.s7("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNgYAAAAAMAASsJTYQAAAAASUVORK5CYII=");
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2(var7);

            try {
               var9 = new com.aspose.slides.internal.o9b.l6(var8);
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            var11 = new t2(var6, "image/png");
         } else {
            var9 = new com.aspose.slides.internal.o9b.l6(var4);
            var11 = new t2(var1, "image/png");
         }

         n3 var16 = new n3(var9.e2(), var9.h0(), var9.c8(), var9.y4(), var2.n5());
         var11.n5(var16);
         var11.n5(var9);
         this.n5.addItem(var3, var11);
         return var11;
      } catch (RuntimeException var15) {
         return null;
      }
   }

   public final com.aspose.slides.internal.o9b.t4 n5(t2 var1, x8 var2) {
      return var1.u3();
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         Dictionary$Enumerator var1 = this.n5.iterator();

         try {
            while (var1.hasNext()) {
               KeyValuePair var2 = (KeyValuePair)var1.next();
               t2 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getValue(), t2.class);
               if (var3 != null) {
                  var3.u3().dispose();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         this.n5.clear();
         this.n5 = null;
      }
   }
}
