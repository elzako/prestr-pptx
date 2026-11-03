package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import java.util.Iterator;

public final class k7 implements ICollection, IEnumerable {
   static byte[] n5 = new byte[0];
   private ArrayList l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("2.5.29.14", "2.5.29.15", "2.5.29.19", "2.5.29.37");

   public k7() {
      this.l6 = new ArrayList();
   }

   public k7(com.aspose.slides.internal.i2i.l6 var1) {
      this.l6 = new ArrayList(var1.l6().size());
      if (var1.l6().size() != 0) {
         Object[] var2 = new Object[2];

         for (Object recoveredElement$var4$950 : var1.l6()) {
            com.aspose.slides.internal.i2i.a6 var4 = (com.aspose.slides.internal.i2i.a6)recoveredElement$var4$950;
            boolean var5 = var4.u3();
            String var6 = var4.k5();
            byte[] var7 = null;
            com.aspose.slides.internal.x8w.l6 var8 = var4.a6();
            if (com.aspose.slides.internal.v6g.k5.u3(var8.l6(), 6) == 4 && var8.n5() > 0) {
               var7 = var8.n5(0).a6();
            }

            m1 var9 = null;
            switch (k5.n5(var6)) {
               case 0:
                  var9 = new w1(new com.aspose.slides.internal.o8m.u3(var6, var7), var5);
                  break;
               case 1:
                  var9 = new z8(new com.aspose.slides.internal.o8m.u3(var6, var7), var5);
                  break;
               case 2:
                  var9 = new a6(new com.aspose.slides.internal.o8m.u3(var6, var7), var5);
                  break;
               case 3:
                  var9 = new z3(new com.aspose.slides.internal.o8m.u3(var6, var7), var5);
            }

            if (var9 == null) {
               byte[] var10 = var7;
               if (var10 == null) {
                  var10 = n5;
               }

               var9 = new m1(var6, var10, var5);
            }

            this.l6.addItem(var9);
         }
      }
   }

   @Override
   public int size() {
      return this.l6.size();
   }

   @Override
   public boolean isSynchronized() {
      return this.l6.isSynchronized();
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   public m1 n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oid");
      }

      if (this.l6.size() != 0 && var1.length() != 0) {
         for (Object recoveredElement$var3$2623 : this.l6) {
            m1 var3 = (m1)recoveredElement$var3$2623;
            if (d1.a6(var3.n5().l6(), var1)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("negative index");
      }

      if (index >= array.a6()) {
         throw new ArgumentOutOfRangeException("index >= array.Length");
      }

      this.l6.copyTo(array, index);
   }

   public m3 n5() {
      return new m3(this.l6);
   }

   // Original IEnumerator forwarding descriptor; javac supplies the Iterator bridge.
   @Override
   public com.aspose.slides.Collections.IEnumerator iterator() {
      return this.n5();
   }




}
