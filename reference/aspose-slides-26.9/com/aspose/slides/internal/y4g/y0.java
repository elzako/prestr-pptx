package com.aspose.slides.internal.y4g;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

public final class y0 extends List<x9> {
   private int n5;

   public x9 n5(String var1) {
      int var2 = this.l6(var1);
      return var2 == -1 ? null : this.get_Item(var2);
   }

   public x9 n5(short var1) {
      int var2 = this.l6(var1);
      return var2 == -1 ? null : this.get_Item(var2);
   }

   public y0(int var1) {
      switch (var1) {
         case -1073741824:
         case 48:
         case 192:
            this.n5 = var1;
            return;
         case 12:
         default:
            throw new NotSupportedException("Unsupported security protocol type.");
      }
   }

   public int l6(String var1) {
      int var2 = 0;

      for (x9 var4 : this) {
         if (d1.h0(var1, var4.x8()) == 0) {
            return var2;
         }

         var2++;
      }

      return -1;
   }

   public int l6(short var1) {
      int var2 = 0;

      for (x9 var4 : this) {
         if (var4.s7() == var1) {
            return var2;
         }

         var2++;
      }

      return -1;
   }

   public void n5(short var1, String var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8, byte var9, short var10, byte var11, byte var12) {
      switch (this.n5) {
         case -1073741824:
         case 192:
            this.addItem(new u6(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12));
            break;
         case 48:
            this.addItem(new n3(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12));
      }
   }

   public IGenericList<String> n5() {
      List var1 = new List(this.size());

      for (x9 var3 : this) {
         var1.addItem(var3.x8());
      }

      return var1;
   }
}
