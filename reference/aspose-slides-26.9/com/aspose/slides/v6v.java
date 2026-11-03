package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class v6v {
   private static final Object k5 = new Object();
   private static final Object u3 = new Object();
   public static final FontData n5 = new FontData("Arial");
   public final List<y5g> l6;
   private final Dictionary<String, Integer> a6;
   private final String[] u9 = new String[3];
   private boolean h0;
   private FontsManager c8;
   private final com.aspose.slides.internal.n2d.z1<Integer, Integer> t2 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, Integer.class);
   private final IGenericList<Integer> s7 = new List<>();

   public v6v(v6v var1) {
      this.l6 = new List<>();
      this.a6 = new Dictionary<>();
      List$Enumerator var2 = var1.l6.iterator();

      try {
         while (var2.hasNext()) {
            y5g var3 = (y5g)var2.next();
            this.n5(var3.n5(), var3.l6(), false, var3.k5().k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var19 = this.l6.iterator();

      try {
         while (var19.hasNext()) {
            y5g var4 = (y5g)var19.next();
            var4.u9();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      List$Enumerator var20 = this.l6.iterator();

      try {
         while (var20.hasNext()) {
            y5g var5 = (y5g)var20.next();
            var5.n5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      if (this.l6.size() > 200) {
         this.l6.clear();
         this.a6.clear();
         this.n5(0, (IFontData)(new FontData("Arial")));
      }
   }

   public v6v() {
      this.l6 = new List<>();
      this.a6 = new Dictionary<>();
   }

   public final int n5(int var1, IFontData var2) {
      return this.n5(var1, var2, false, new com.aspose.slides.ms.System.o5<>());
   }

   public final int n5(int var1, IFontData var2, boolean var3, com.aspose.slides.ms.System.o5<Integer> var4) {
      int var5;
      if (this.n5(var2)) {
         var5 = 65535;
      } else if (var2.getFontName() == null) {
         int var6 = this.l6("00Arial");
         this.l6.get_Item(var6).n5(this.h0());
         var5 = var6 & 65535;
      } else {
         int var12 = "Arial".equals(var2.getFontName()) ? 0 : var1;
         String var7 = this.n5(var12, (FontData)var2);
         synchronized (k5) {
            int var9 = this.l6(var7);
            if (!var3 && var9 != -1) {
               this.l6.get_Item(var9).n5(this.h0());
               var5 = var9 & 65535;
            } else {
               if (this.l6.size() >= 65535) {
                  throw new InvalidOperationException();
               }

               this.l6.addItem(new y5g(this, var12, var2, var4.k5(), this.h0()));
               var5 = this.l6.size() - 1 & 65535;
               if (var9 == -1) {
                  this.a6.addItem(var7, var5);
               }
            }
         }
      }

      this.n5(var2, var5);
      return var5;
   }

   private boolean n5(IFontData var1) {
      return var1 == null || com.aspose.slides.ms.System.d1.n5(var1.getFontName());
   }

   private void n5(IFontData var1, int var2) {
      if (!this.n5(var1)) {
         if (!com.aspose.slides.ms.System.d1.t2(var1.getFontName(), "+m")) {
            synchronized (u3) {
               if (!this.t2.containsKey(var2)) {
                  int var4 = 65535;
                  IGenericEnumerator var5 = this.t2.iterator();

                  try {
                     while (var5.hasNext()) {
                        KeyValuePair var6 = (KeyValuePair)var5.next();
                        y5g var7 = this.n5((Integer)var6.getKey() & 65535);
                        if (com.aspose.slides.ms.System.d1.a6(var7.l6().getFontName(), var1.getFontName())) {
                           this.t2.set_Item(var2, (Integer)var6.getValue());
                           return;
                        }

                        if (var4 == 65535 || (var4 & 65535) < ((Integer)var6.getValue() & 65535)) {
                           var4 = (Integer)var6.getValue();
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                        var5.dispose();
                     }
                  }

                  this.t2.set_Item(var2, var4 == 65535 ? 0 : ++var4);
                  this.s7.addItem(var2);
               }
            }
         }
      }
   }

   private int l6(String var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = this.a6.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 & 65535 : -1;
   }

   private String n5(int var1, FontData var2) {
      this.u9[0] = com.aspose.slides.ms.System.e2.n5((byte)var1, com.aspose.slides.internal.x7n.l6.k5());
      this.u9[1] = com.aspose.slides.ms.System.e2.n5(var2.l6(), com.aspose.slides.internal.x7n.l6.k5());
      this.u9[2] = var2.getFontName();
      return com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ this.u9[0], this.u9[1], this.u9[2]});
   }

   public final List<y5g> l6(int var1, IFontData var2) {
      return this.l6.findAll(new v6v$1(this, var1, var2));
   }

   static boolean n5(int var0, y5g var1, IFontData var2) {
      boolean var3 = var1.n5() == var0 && com.aspose.slides.ms.System.d1.a6(var1.l6().getFontName(), var2.getFontName());
      FontData var4 = com.aspose.slides.internal.v6g.k5.n5(var2, FontData.class);
      FontData var5 = com.aspose.slides.internal.v6g.k5.n5(var1.l6(), FontData.class);
      return var3;
   }

   final FontsManager n5() {
      return this.c8;
   }

   final void n5(FontsManager var1) {
      this.c8 = var1;
   }

   public final boolean n5(IFontData var1, IFontData var2) {
      boolean var3 = false;
      IEnumerator var4 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(p5i.class)).iterator();

      try {
         while (var4.hasNext()) {
            int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), 11);
            List var6 = this.l6(var5, var1);
            if (var6 != null && var6.size() != 0) {
               int var7 = 0;
               List$Enumerator var8 = var6.iterator();

               try {
                  while (var8.hasNext()) {
                     y5g var9 = (y5g)var8.next();
                     FontData var10 = com.aspose.slides.internal.v6g.k5.n5(var9.l6(), FontData.class);
                     if (var10 != null) {
                        var9.n5(var2);
                        var7++;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               var3 = var7 > 0;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      return var3;
   }

   public final boolean n5(IFontData var1, IFontData var2, int var3) {
      boolean var4 = false;
      IEnumerator var5 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(p5i.class)).iterator();

      try {
         while (var5.hasNext()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), 11);
            List var7 = this.l6(var6, var1);
            if (var7 != null && var7.size() != 0) {
               int var8 = 0;
               List$Enumerator var9 = var7.iterator();

               try {
                  while (var9.hasNext()) {
                     y5g var10 = (y5g)var9.next();
                     if (!var10.a6()) {
                        FontData var11 = com.aspose.slides.internal.v6g.k5.n5(var10.l6(), FontData.class);
                        if (var11 == null) {
                           continue;
                        }

                        var10.l6(var2);
                        var10.n5(var3);
                     }

                     var8++;
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }

               var4 = var8 > 0;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      return var4;
   }

   public final void l6() {
      IGenericEnumerator var1 = this.u9().iterator();

      try {
         while (var1.hasNext()) {
            y5g var2 = (y5g)var1.next();
            var2.l6(null);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final y5g n5(int var1) {
      if (var1 != 65535 && var1 < this.l6.size()) {
         return this.l6.get_Item(var1);
      }

      int var2 = this.l6("00Arial");
      if (var2 != -1) {
         return this.l6.get_Item(var2);
      }

      if (this.l6.size() == 0) {
         this.n5(0, (IFontData)(new FontData("Arial")));
      }

      return this.l6.get_Item(0);
   }

   public final y5g l6(int var1) {
      int var2 = this.l6.findIndex(new v6v$2(this, var1));
      return var2 == -1 ? this.n5(this.l6("00Arial")) : this.n5(var2);
   }

   public final int k5() {
      int var1 = 0;
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            y5g var3 = (y5g)var2.next();
            if (var3.k5().l6()) {
               var1++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final IGenericList<IFontData> u3() {
      List var1 = new List();
      synchronized (u3) {
         IGenericEnumerator var3 = this.s7.iterator();

         try {
            while (var3.hasNext()) {
               int var4 = com.aspose.slides.internal.v6g.k5.u3(var3.next(), int.class);
               IFontData var5 = this.n5(var4 & 65535).l6();
               if (!var1.containsItem(var5)) {
                  var1.addItem(var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return var1;
      }
   }

   public final int a6() {
      return this.s7.size();
   }

   public final IGenericList<y5g> u9() {
      return this.l6.asReadOnly();
   }

   public final boolean h0() {
      return this.h0;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public static int n5(String var0) {
      if (var0 != null && var0.length() > 5 && com.aspose.slides.ms.System.d1.n5(var0, 4, "lt", 0, 2) == 0) {
         return 0;
      } else if (var0 != null && var0.length() > 5 && com.aspose.slides.ms.System.d1.n5(var0, 4, "ea", 0, 2) == 0) {
         return 1;
      } else {
         return var0 != null && var0.length() > 5 && com.aspose.slides.ms.System.d1.n5(var0, 4, "cs", 0, 2) == 0 ? 2 : 0;
      }
   }

   public final int k5(int var1) {
      return !this.t2.containsKey(var1) ? 0 : this.t2.get_Item(var1);
   }

   public final void c8() {
      this.t2.clear();
      this.s7.clear();
   }
}
