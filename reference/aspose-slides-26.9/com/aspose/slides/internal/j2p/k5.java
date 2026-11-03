package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

public class k5 extends n5 {
   private void n5(String var1, SortedList var2, SortedList var3, Hashtable var4) {
      IEnumerator var5 = var3.getKeyList().iterator();

      try {
         while (var5.hasNext()) {
            Object var6 = var5.next();
            if (i9.n5((u8)var6, var1)) {
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      IEnumerator var20 = var2.getKeyList().iterator();

      try {
         while (var20.hasNext()) {
            Object var7 = var20.next();
            if (com.aspose.slides.ms.System.d1.a6(((u8)var7).getLocalName(), var1)) {
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            ((IDisposable)var20).dispose();
         }
      }

      int var21 = 0;
      u8 var8 = (u8)var4.get_Item(var1);
      int[] var9 = new int[]{0};
      u8 var10 = this.n5(var1, var9);
      var21 = var9[0];
      if (var8 != null) {
         if (i9.n5(var8, var10)) {
            var4.removeItem(var1);
            if (i9.l6((l0)var8)) {
               var2.addItem(var8, null);
            } else {
               var3.addItem(var8, null);
            }
         }
      } else {
         int var11 = 0;
         int[] var12 = new int[]{0};
         u8 var13 = this.l6(var1, var12);
         var11 = var12[0];
         if (var13 != null && var11 > var21 && i9.n5(var13, var10)) {
            if (i9.l6((l0)var13)) {
               var2.addItem(var13, null);
            } else {
               var3.addItem(var13, null);
            }
         }
      }
   }

   @Override
   public void n5(m8 var1, SortedList var2, SortedList var3, Hashtable var4) {
      u8 var5 = null;
      Object[] var6 = new Object[var4.size()];
      var4.getValues().copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0);

      for (Object var10 : var6) {
         var5 = (u8)var10;
         int var11 = 0;
         int[] var12 = new int[]{0};
         u8 var13 = this.n5(i9.n5(var5), var12);
         var11 = var12[0];
         if (i9.n5(var5, var13)) {
            var4.removeItem(i9.n5(var5));
            if (i9.l6((l0)var5)) {
               var2.addItem(var5, null);
            } else {
               var3.addItem(var5, null);
            }
         }
      }

      for (int var19 = this.n5.size() - 1; var19 >= 0; var19--) {
         IEnumerator var20 = this.n5(var19).n5().getValues().iterator();

         try {
            while (var20.hasNext()) {
               Object var21 = var20.next();
               var5 = (u8)var21;
               if (var5 != null) {
                  this.n5(i9.n5(var5), var2, var3, var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               ((IDisposable)var20).dispose();
            }
         }
      }
   }

   @Override
   public void n5(u8 var1, SortedList var2, Hashtable var3) {
      var3.addItem(i9.n5(var1), var1);
   }

   @Override
   public void n5(u8 var1, SortedList var2, SortedList var3, Hashtable var4) {
      var4.addItem(i9.n5(var1), var1);
   }
}
