package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.ms.System.j3;

@j3
class RBTree {
   private RBTree$Node n5;
   private Object l6;
   private long k5;

   static List<RBTree$Node> n5() {
      return new List<>();
   }

   static void n5(List<RBTree$Node> var0) {
   }

   public RBTree(Object hlp) {
      this.l6 = hlp;
   }

   public void l6() {
      this.n5 = null;
      this.k5++;
   }

   public <T> RBTree$Node n5(T var1, RBTree$Node var2) {
      if (this.n5 == null) {
         if (var2 == null) {
            var2 = ((RBTree$INodeHelper)this.l6).createNode(var1);
         }

         this.n5 = var2;
         this.n5.isBlack(true);
         this.k5++;
         return this.n5;
      } else {
         List var3 = n5();
         int var4 = this.n5(var1, var3);
         RBTree$Node var5 = (RBTree$Node)var3.get_Item(var3.size() - 1);
         if (var5 == null) {
            if (var2 == null) {
               var2 = ((RBTree$INodeHelper)this.l6).createNode(var1);
            }

            var5 = this.n5(var4, var2, var3);
         }

         n5(var3);
         return var5;
      }
   }

   public <T> RBTree$Node n5(T var1) {
      if (this.n5 == null) {
         return null;
      }

      List var2 = n5();
      int var3 = this.n5(var1, var2);
      RBTree$Node var4 = null;
      if (var3 == 0) {
         var4 = this.l6(var2);
      }

      n5(var2);
      return var4;
   }

   public <T> RBTree$Node l6(T var1) {
      RBTree$INodeHelper var2 = (RBTree$INodeHelper)this.l6;
      RBTree$Node var3 = this.n5;

      while (var3 != null) {
         int var4 = var2.compare(var1, var3);
         if (var4 == 0) {
            break;
         }

         var3 = var4 < 0 ? var3.left : var3.right;
      }

      return var3;
   }

   public int k5() {
      return this.n5 == null ? 0 : (int)(this.n5.getSize() & 4294967295L);
   }

   public RBTree$NodeEnumerator u3() {
      return new RBTree$NodeEnumerator(this);
   }

   RBTree a6() {
      return this;
   }

   public IEnumerable u9() {
      return new RBTree$2(this);
   }

   private <T> int n5(T var1, List<RBTree$Node> var2) {
      RBTree$INodeHelper var3 = (RBTree$INodeHelper)this.l6;
      int var4 = 0;
      RBTree$Node var5 = null;
      RBTree$Node var6 = this.n5;
      if (var2 != null) {
         var2.addItem(this.n5);
      }

      while (var6 != null) {
         var4 = var3.compare(var1, var6);
         if (var4 == 0) {
            return var4;
         }

         if (var4 < 0) {
            var5 = var6.right;
            var6 = var6.left;
         } else {
            var5 = var6.left;
            var6 = var6.right;
         }

         if (var2 != null) {
            var2.addItem(var5);
            var2.addItem(var6);
         }
      }

      return var4;
   }

   private RBTree$Node n5(int var1, RBTree$Node var2, List<RBTree$Node> var3) {
      var3.set_Item(var3.size() - 1, var2);
      RBTree$Node var4 = (RBTree$Node)var3.get_Item(var3.size() - 3);
      if (var1 < 0) {
         var4.left = var2;
      } else {
         var4.right = var2;
      }

      for (int var5 = 0; var5 < var3.size() - 2; var5 += 2) {
         ((RBTree$Node)var3.get_Item(var5)).setSize(((RBTree$Node)var3.get_Item(var5)).getSize() + 1L);
      }

      if (!var4.isBlack()) {
         this.k5(var3);
      }

      if (!this.n5.isBlack()) {
         throw new SystemException("Internal error: root is not black");
      }

      this.k5++;
      return var2;
   }

   private RBTree$Node l6(List<RBTree$Node> var1) {
      int var2 = var1.size() - 1;
      RBTree$Node var3 = (RBTree$Node)var1.get_Item(var2);
      if (var3.left != null) {
         RBTree$Node var4 = n5(var3.left, var3.right, var1);
         var3.swapValue(var4);
         if (var4.left != null) {
            RBTree$Node var5 = var4.left;
            var1.addItem(null);
            var1.addItem(var5);
            var4.swapValue(var5);
         }
      } else if (var3.right != null) {
         RBTree$Node var8 = var3.right;
         var1.addItem(null);
         var1.addItem(var8);
         var3.swapValue(var8);
      }

      var2 = var1.size() - 1;
      var3 = (RBTree$Node)var1.get_Item(var2);
      if ((var3.getSize() & 4294967295L) != 1L) {
         throw new SystemException("Internal Error: red-black violation somewhere");
      }

      var1.set_Item(var2, null);
      this.n5(var2 == 0 ? null : (RBTree$Node)var1.get_Item(var2 - 2), var3, 0L, null);

      for (int var9 = 0; var9 < var1.size() - 2; var9 += 2) {
         ((RBTree$Node)var1.get_Item(var9)).setSize(((RBTree$Node)var1.get_Item(var9)).getSize() - 1L);
      }

      if (var3.isBlack()) {
         var3.isBlack(false);
         if (var2 != 0) {
            this.u3(var1);
         }
      }

      if (this.n5 != null && !this.n5.isBlack()) {
         throw new SystemException("Internal Error: root is not black");
      }

      this.k5++;
      return var3;
   }

   private void k5(List<RBTree$Node> var1) {
      int var2 = var1.size() - 1;

      while (var1.get_Item(var2 - 3) != null && !((RBTree$Node)var1.get_Item(var2 - 3)).isBlack()) {
         ((RBTree$Node)var1.get_Item(var2 - 3)).isBlack(true);
         ((RBTree$Node)var1.get_Item(var2 - 2)).isBlack(true);
         var2 -= 4;
         if (var2 == 0) {
            return;
         }

         ((RBTree$Node)var1.get_Item(var2)).isBlack(false);
         if (((RBTree$Node)var1.get_Item(var2 - 2)).isBlack()) {
            return;
         }
      }

      this.n5(var2, var1);
   }

   private void u3(List<RBTree$Node> var1) {
      int var2 = var1.size() - 1;

      do {
         RBTree$Node var3 = (RBTree$Node)var1.get_Item(var2 - 1);
         if (!var3.isBlack()) {
            var2 = this.k5(var2, var1);
            var3 = (RBTree$Node)var1.get_Item(var2 - 1);
         }

         if (var3.left != null && !var3.left.isBlack() || var3.right != null && !var3.right.isBlack()) {
            this.l6(var2, var1);
            return;
         }

         var3.isBlack(false);
         var2 -= 2;
         if (var2 == 0) {
            return;
         }
      } while (((RBTree$Node)var1.get_Item(var2)).isBlack());

      ((RBTree$Node)var1.get_Item(var2)).isBlack(true);
   }

   private void n5(int var1, List<RBTree$Node> var2) {
      RBTree$Node var3 = (RBTree$Node)var2.get_Item(var1);
      RBTree$Node var4 = (RBTree$Node)var2.get_Item(var1 - 2);
      RBTree$Node var5 = (RBTree$Node)var2.get_Item(var1 - 4);
      long var6 = var5.getSize();
      boolean var8 = var4 == var5.left;
      boolean var9 = var3 == var4.left;
      RBTree$Node var10;
      if (var8 && var9) {
         var5.left = var4.right;
         var4.right = var5;
         var10 = var4;
      } else if (var8 && !var9) {
         var5.left = var3.right;
         var3.right = var5;
         var4.right = var3.left;
         var3.left = var4;
         var10 = var3;
      } else if (!var8 && var9) {
         var5.right = var3.left;
         var3.left = var5;
         var4.left = var3.right;
         var3.right = var4;
         var10 = var3;
      } else {
         var5.right = var4.left;
         var4.left = var5;
         var10 = var4;
      }

      var5.fixSize();
      var5.isBlack(false);
      if (var10 != var4) {
         var4.fixSize();
      }

      var10.isBlack(true);
      this.n5(var1 == 4 ? null : (RBTree$Node)var2.get_Item(var1 - 6), var5, var6, var10);
   }

   private void l6(int var1, List<RBTree$Node> var2) {
      RBTree$Node var3 = (RBTree$Node)var2.get_Item(var1 - 1);
      RBTree$Node var4 = (RBTree$Node)var2.get_Item(var1 - 2);
      long var5 = var4.getSize();
      boolean var7 = var4.isBlack();
      RBTree$Node var9;
      if (var4.right == var3) {
         if (var3.right != null && !var3.right.isBlack()) {
            var4.right = var3.left;
            var3.left = var4;
            var3.right.isBlack(true);
            var9 = var3;
         } else {
            RBTree$Node var8 = var3.left;
            var4.right = var8.left;
            var8.left = var4;
            var3.left = var8.right;
            var8.right = var3;
            var9 = var8;
         }
      } else if (var3.left != null && !var3.left.isBlack()) {
         var4.left = var3.right;
         var3.right = var4;
         var3.left.isBlack(true);
         var9 = var3;
      } else {
         RBTree$Node var10 = var3.right;
         var4.left = var10.right;
         var10.right = var4;
         var3.right = var10.left;
         var10.left = var3;
         var9 = var10;
      }

      var4.fixSize();
      var4.isBlack(true);
      if (var9 != var3) {
         var3.fixSize();
      }

      var9.isBlack(var7);
      this.n5(var1 == 2 ? null : (RBTree$Node)var2.get_Item(var1 - 4), var4, var5, var9);
   }

   private int k5(int var1, List<RBTree$Node> var2) {
      RBTree$Node var3 = (RBTree$Node)var2.get_Item(var1);
      RBTree$Node var4 = (RBTree$Node)var2.get_Item(var1 - 1);
      RBTree$Node var5 = (RBTree$Node)var2.get_Item(var1 - 2);
      long var6 = var5.getSize();
      boolean var8;
      if (var5.right == var4) {
         var5.right = var4.left;
         var4.left = var5;
         var8 = true;
      } else {
         var5.left = var4.right;
         var4.right = var5;
         var8 = false;
      }

      var5.fixSize();
      var5.isBlack(false);
      var4.isBlack(true);
      this.n5(var1 == 2 ? null : (RBTree$Node)var2.get_Item(var1 - 4), var5, var6, var4);
      if (var1 + 1 == var2.size()) {
         var2.addItem(null);
         var2.addItem(null);
      }

      var2.set_Item(var1 - 2, var4);
      var2.set_Item(var1 - 1, var8 ? var4.right : var4.left);
      var2.set_Item(var1, var5);
      var2.set_Item(var1 + 1, var8 ? var5.right : var5.left);
      var2.set_Item(var1 + 2, var3);
      return var1 + 2;
   }

   private void n5(RBTree$Node var1, RBTree$Node var2, long var3, RBTree$Node var5) {
      if (var5 != null && var5.fixSize() != var3) {
         throw new SystemException("Internal error: rotation");
      }

      if (var2 == this.n5) {
         this.n5 = var5;
      } else if (var2 == var1.left) {
         var1.left = var5;
      } else {
         if (var2 != var1.right) {
            throw new SystemException("Internal error: path error");
         }

         var1.right = var5;
      }
   }

   static RBTree$Node n5(RBTree$Node var0, RBTree$Node var1, List<RBTree$Node> var2) {
      while (true) {
         var2.addItem(var1);
         var2.addItem(var0);
         if (var0.right == null) {
            return var0;
         }

         var1 = var0.left;
         var0 = var0.right;
      }
   }

   // $VF: synthetic method
   static long n5(RBTree var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static RBTree$Node l6(RBTree var0) {
      return var0.n5;
   }
}
