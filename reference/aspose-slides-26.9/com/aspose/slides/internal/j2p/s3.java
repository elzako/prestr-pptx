package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

public class s3 extends n5 {
   private Hashtable l6 = null;

   public s3(String var1) {
      this.l6 = i9.k5(var1);
   }

   private boolean k5(u8 var1) {
      int var2 = 0;
      String var3 = i9.n5(var1);
      int[] var4 = new int[]{0};
      boolean var5 = this.l6.containsKey(var3) && i9.n5(var1, this.n5(var3, var4));
      var2 = var4[0];
      return var5;
   }

   private void n5(String var1, SortedList var2, Hashtable var3) {
      IEnumerator var4 = var2.getKeyList().iterator();

      try {
         while (var4.hasNext()) {
            Object var5 = var4.next();
            if (i9.n5((u8)var5, var1)) {
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      int var14 = 0;
      u8 var6 = (u8)var3.get_Item(var1);
      int[] var7 = new int[]{0};
      u8 var8 = this.n5(var1, var7);
      var14 = var7[0];
      if (var6 != null) {
         if (i9.n5(var6, var8)) {
            var3.removeItem(var1);
            var2.addItem(var6, null);
         }
      } else {
         int var9 = 0;
         int[] var10 = new int[]{0};
         u8 var11 = this.l6(var1, var10);
         var9 = var10[0];
         if (var11 != null && var9 > var14 && i9.n5(var11, var8)) {
            var2.addItem(var11, null);
         }
      }
   }

   @Override
   public void n5(m8 var1, SortedList var2, SortedList var3, Hashtable var4) {
      this.n5(var1.getPrefix(), var3, var4);
      IEnumerator var5 = var2.getKeyList().iterator();

      try {
         while (var5.hasNext()) {
            Object var6 = var5.next();
            String var7 = ((u8)var6).getPrefix();
            if (var7.length() > 0) {
               this.n5(var7, var3, var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }
   }

   @Override
   public void n5(u8 var1, SortedList var2, Hashtable var3) {
      if (!i9.l6(var1)) {
         if (this.k5(var1)) {
            var2.addItem(var1, null);
         } else {
            var3.addItem(i9.n5(var1), var1);
         }
      }
   }

   @Override
   public void n5(u8 var1, SortedList var2, SortedList var3, Hashtable var4) {
      var3.addItem(var1, null);
   }
}
