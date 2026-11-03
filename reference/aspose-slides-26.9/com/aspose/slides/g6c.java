package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class g6c extends com.aspose.slides.internal.c8m.o5 {
   private boolean n5;
   private IPptxOptions l6;
   private final IPresentation k5;
   private final InterruptionToken u3;
   private int a6 = 0;
   private final Dictionary<IBaseSlide, String> u9;
   private final Dictionary<IBaseSlide, com.aspose.slides.internal.c8m.j8> h0;
   private final Dictionary<ITheme, com.aspose.slides.internal.c8m.j8> c8;
   private final Dictionary<com.aspose.slides.ms.System.o0, com.aspose.slides.internal.c8m.j8> t2;
   private final Dictionary<IAudio, com.aspose.slides.internal.c8m.j8> s7;
   private final Dictionary<IVideo, com.aspose.slides.internal.c8m.j8> x8;
   private final Dictionary<ICustomXmlPart, com.aspose.slides.internal.c8m.r7> n3;
   private final Dictionary<com.aspose.slides.ms.System.o0, com.aspose.slides.internal.c8m.j8> y4;
   private int e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private int m3;
   private int z8;
   private int j5;
   private int w1;
   private int r4;
   private int c4;
   private int y2 = 1037;
   private int y1;
   private int a0;
   private int d2;
   private int d5;
   private int s3;
   private int p8;
   private int f2;
   private int i1;
   private int e5;
   private int b3;
   private int o0;
   private int z7;
   private final int[] v4;
   private Dictionary<com.aspose.slides.ms.System.o0, com.aspose.slides.ms.System.o0> u6;

   public g6c(com.aspose.slides.internal.c8m.d9 var1, IPresentation var2, int[] var3, IPptxOptions var4, InterruptionToken var5) {
      super(var1);
      this.k5 = var2;
      this.n5(var4);
      this.u3 = var5;
      this.u9 = new Dictionary<>();
      this.h0 = new Dictionary<>();
      this.t2 = new Dictionary<>();
      this.s7 = new Dictionary<>();
      this.x8 = new Dictionary<>();
      this.c8 = new Dictionary<>();
      this.y4 = new Dictionary<>();
      this.n3 = new Dictionary<>();
      this.u6 = new Dictionary<>();
      this.n5(false);
      if (var3 == null) {
         this.v4 = new int[var2.getSlides().size()];

         for (int var6 = 0; var6 < var2.getSlides().size(); var6++) {
            this.v4[var6] = var6 + 1;
         }
      } else {
         this.v4 = var3;
      }
   }

   final int[] n5() {
      return this.v4;
   }

   final void n5(t5w var1) {
      switch (this.h0()) {
         case 0:
         case 2:
            return;
         case 1:
            Dictionary$Enumerator var2 = this.t2.iterator();

            try {
               while (var2.hasNext()) {
                  KeyValuePair var3 = (KeyValuePair)var2.next();
                  PPImage var4 = ((ImageCollection)this.t2().getImages()).n5(((com.aspose.slides.ms.System.o0)var3.getKey()).k5());
                  if (var4 != null) {
                     var1.l6().addItem((com.aspose.slides.internal.c8m.j8)var3.getValue(), var4);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }

            Dictionary$Enumerator var29 = this.s7.iterator();

            try {
               while (var29.hasNext()) {
                  KeyValuePair var30 = (KeyValuePair)var29.next();
                  var1.k5().addItem((com.aspose.slides.internal.c8m.j8)var30.getValue(), (IAudio)var30.getKey());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
                  var29.dispose();
               }
            }

            Dictionary$Enumerator var31 = this.x8.iterator();

            try {
               while (var31.hasNext()) {
                  KeyValuePair var5 = (KeyValuePair)var31.next();
                  var1.u3().addItem((com.aspose.slides.internal.c8m.j8)var5.getValue(), (IVideo)var5.getKey());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
                  var31.dispose();
               }
            }

            Dictionary$Enumerator var32 = this.y4.iterator();

            try {
               while (var32.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var32.next();
                  n4 var7 = ((Presentation)this.t2()).z3().n5(((com.aspose.slides.ms.System.o0)var6.getKey()).k5());
                  if (var7 != null) {
                     var1.a6().addItem((com.aspose.slides.internal.c8m.j8)var6.getValue(), var7);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
                  var32.dispose();
               }
            }

            switch (this.h0()) {
               case 1:
                  var1.n5();
               case 0:
               case 2:
                  return;
               default:
                  throw new Exception();
            }
         default:
            throw new Exception();
      }
   }

   public final Dictionary<IBaseSlide, String> l6() {
      return this.u9;
   }

   public final Dictionary<IBaseSlide, com.aspose.slides.internal.c8m.j8> k5() {
      return this.h0;
   }

   public final Dictionary<ITheme, com.aspose.slides.internal.c8m.j8> u3() {
      return this.c8;
   }

   public final com.aspose.slides.internal.c8m.d9 a6() {
      return (com.aspose.slides.internal.c8m.d9)super.v4();
   }

   final com.aspose.slides.internal.c8m.j8 n5(IPPImage var1) {
      return !this.t2.containsKey(((PPImage)var1).n3().k5()) ? this.k5(var1) : this.t2.get_Item(((PPImage)var1).n3().k5());
   }

   final com.aspose.slides.internal.c8m.j8 l6(IPPImage var1) {
      com.aspose.slides.internal.c8m.j8 var2 = null;
      com.aspose.slides.internal.c8m.j8[] var3 = new com.aspose.slides.internal.c8m.j8[]{var2};
      boolean var4 = !this.t2.tryGetValue(((PPImage)var1).n3().k5(), var3);
      var2 = var3[0];
      if (var4) {
         switch (this.h0()) {
            case 0:
            case 1:
            case 2:
               return this.k5(var1);
            default:
               throw new Exception();
         }
      } else {
         return var2;
      }
   }

   final com.aspose.slides.internal.c8m.j8 n5(ISlidesPicture var1) {
      ISvgImage var2 = var1.getImage().getSvgImage();
      PictureFrame var3 = com.aspose.slides.internal.v6g.k5.n5(((Picture)var1).getParent_Immediate().getParent_Immediate(), PictureFrame.class);
      if (var3 != null && ((SvgImage)var2).k5()) {
         ISvgImage var4 = var3.x8();
         if (var4 == null) {
            var4 = ((SvgImage)var2).n5(var3);
         }

         var2 = var4;
      }

      IGenericEnumerator var19 = var1.getPresentation().getImages().iterator();

      try {
         while (var19.hasNext()) {
            IPPImage var5 = (IPPImage)var19.next();
            com.aspose.slides.internal.c8m.j8 var6 = null;
            com.aspose.slides.internal.c8m.j8[] var7 = new com.aspose.slides.internal.c8m.j8[]{var6};
            boolean var8 = var5.getSvgImage() != null
               && this.t2.tryGetValue(((PPImage)var5).n3().k5(), var7)
               && ((SvgImage)var5.getSvgImage()).l6() == ((SvgImage)var2).l6();
            var6 = var7[0];
            if (var8) {
               return var6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      ((ImageCollection)var1.getPresentation().getImages()).n5(var1.getImage());
      IPPImage var20 = ((ImageCollection)var1.getPresentation().getImages()).n5(var2, 4.0F);
      IGenericEnumerator var22 = var1.getPresentation().getImages().iterator();

      try {
         while (var22.hasNext()) {
            IPPImage var23 = (IPPImage)var22.next();
            com.aspose.slides.internal.c8m.j8 var24 = null;
            com.aspose.slides.internal.c8m.j8[] var9 = new com.aspose.slides.internal.c8m.j8[]{var24};
            boolean var10 = var23.getSvgImage() != null
               && this.t2.tryGetValue(((PPImage)var23).n3().k5(), var9)
               && ((PPImage)var23).u9() == ((PPImage)var20).u9();
            var24 = var9[0];
            if (var10) {
               return var24;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      return this.l6(var20);
   }

   final com.aspose.slides.internal.c8m.j8 k5(IPPImage var1) {
      com.aspose.slides.internal.c8m.y8 var2 = ((PPImage)var1).l6();
      com.aspose.slides.internal.c8m.j8 var3 = this.a6().n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/media/image{0}.", var2.u3()}), new g6c$1(this), var2);
      switch (this.h0()) {
         case 0:
         case 2:
            var3.n5(((PPImage)var1).a6());
            break;
         case 1:
            var3.n5(true);
            break;
         default:
            throw new Exception();
      }

      this.t2.addItem(((PPImage)var1).n3().k5(), var3);
      return var3;
   }

   final com.aspose.slides.internal.c8m.j8 n5(com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.j9e.x8 var2 = var1.x8();
      com.aspose.slides.internal.c8m.y8 var3 = new com.aspose.slides.internal.c8m.r8();
      if (var2.equals(com.aspose.slides.internal.j9e.x8.s7())) {
         var3 = new com.aspose.slides.internal.c8m.l4();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.c8())) {
         var3 = new com.aspose.slides.internal.c8m.h6();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.u3())) {
         var3 = new com.aspose.slides.internal.c8m.d1();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.n3())) {
         var3 = new com.aspose.slides.internal.c8m.k8();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.u9())) {
         var3 = new com.aspose.slides.internal.c8m.s4();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.x8())) {
         var3 = new com.aspose.slides.internal.c8m.a7();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.k5())) {
         var3 = new com.aspose.slides.internal.c8m.p6();
      } else if (var2.equals(com.aspose.slides.internal.j9e.x8.t2())) {
         var3 = new com.aspose.slides.internal.c8m.l4();
         var2 = com.aspose.slides.internal.j9e.x8.s7();
      }

      com.aspose.slides.internal.c8m.j8 var4 = this.a6().n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/media/image{0}.", var3.u3()}), new g6c$2(this), var3);
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.n5(var5, var2);
         var4.n5(var5.toArray());
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var4;
   }

   final com.aspose.slides.internal.c8m.j8 n5(IAudio var1) {
      return !this.s7.containsKey(var1) ? this.l6(var1) : this.s7.get_Item(var1);
   }

   final IAudio n5(com.aspose.slides.internal.c8m.j8 var1) {
      Dictionary$Enumerator var2 = this.s7.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (var3.getValue() == var1) {
               return (IAudio)var3.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final com.aspose.slides.internal.c8m.j8 l6(IAudio var1) {
      Audio var2 = (Audio)var1;
      String var3 = "media{0}";
      String var4 = var2.n5().n5();
      if (!com.aspose.slides.ms.System.d1.n5(var4) && !com.aspose.slides.ms.System.d1.l6(var4, "media")) {
         var4 = com.aspose.slides.ms.System.d1.n5(var4, ' ', '_');
         int var5 = com.aspose.slides.ms.System.d1.k5(var4, '.');
         var3 = var5 == -1 ? var4 : com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.l6(var4, 0, var5), "{0}"});
      }

      com.aspose.slides.internal.c8m.j8 var7 = this.a6()
         .n5(
            com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/media/", var3, ".", var2.u9()}),
            new g6c$3(this),
            com.aspose.slides.internal.c8m.q3.n5(var2.getContentType())
         );
      switch (this.h0()) {
         case 0:
         case 2:
            var7.n5(var1.getBinaryData());
            break;
         case 1:
            var7.n5(true);
            break;
         default:
            throw new Exception();
      }

      this.s7.addItem(var1, var7);
      return var7;
   }

   final com.aspose.slides.internal.c8m.j8 n5(IVideo var1) {
      return !this.x8.containsKey(var1) ? this.l6(var1) : this.x8.get_Item(var1);
   }

   final com.aspose.slides.internal.c8m.j8 l6(IVideo var1) {
      Video var2 = (Video)var1;
      com.aspose.slides.internal.c8m.j8 var3 = this.a6()
         .n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/media/media{0}.", var2.u3()}), new g6c$4(this), com.aspose.slides.internal.c8m.q3.n5(var2.getContentType()));
      switch (this.h0()) {
         case 0:
         case 2:
            var3.n5(var2.a6());
            break;
         case 1:
            var3.n5(true);
            break;
         default:
            throw new Exception();
      }

      this.x8.addItem(var1, var3);
      return var3;
   }

   final Dictionary<ICustomXmlPart, com.aspose.slides.internal.c8m.r7> u9() {
      return this.n3;
   }

   final com.aspose.slides.internal.c8m.j8 n5(n4 var1) {
      return !this.y4.containsKey(var1.n5().k5()) ? this.l6(var1) : this.y4.get_Item(var1.n5().k5());
   }

   final com.aspose.slides.internal.c8m.j8 l6(n4 var1) {
      com.aspose.slides.internal.c8m.j8 var2 = this.a6().n5("/ppt/media/track{0}.vtt", new g6c$5(this), new com.aspose.slides.internal.c8m.c7());
      switch (this.h0()) {
         case 0:
         case 2:
            var2.n5(var1.l6());
            break;
         case 1:
            var2.n5(true);
            break;
         default:
            throw new Exception();
      }

      this.y4.addItem(var1.n5().k5(), var2);
      return var2;
   }

   final int h0() {
      return this.a6;
   }

   final void n5(int var1) {
      this.a6 = var1;
   }

   final boolean c8() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final IPresentation t2() {
      return this.k5;
   }

   public final int s7() {
      return ++this.m3;
   }

   public final int x8() {
      return ++this.z8;
   }

   public final int n3() {
      return ++this.j5;
   }

   public final int y4() {
      return ++this.w1;
   }

   public final int e2() {
      return ++this.r4;
   }

   public final int t9() {
      return ++this.c4;
   }

   public final int z1() {
      return ++this.i1;
   }

   public final int t4() {
      return ++this.y2;
   }

   public final int q0() {
      return ++this.y1;
   }

   public final int z3() {
      return this.y1;
   }

   public final void l6(int var1) {
      this.y1 = var1;
   }

   public final int m1() {
      return ++this.a0;
   }

   public final int k7() {
      return ++this.d2;
   }

   public final int m3() {
      return ++this.d5;
   }

   public final int z8() {
      return ++this.f2;
   }

   public final int j5() {
      return this.d5;
   }

   public final int w1() {
      return ++this.s3;
   }

   public final int r4() {
      return ++this.p8;
   }

   public final int c4() {
      return ++this.e2;
   }

   public final int y2() {
      return ++this.t9;
   }

   public final int y1() {
      return ++this.z1;
   }

   public final int a0() {
      return ++this.t4;
   }

   public final int d2() {
      return ++this.q0;
   }

   public final int d5() {
      return ++this.z3;
   }

   public final int s3() {
      return ++this.m1;
   }

   public final int p8() {
      return ++this.k7;
   }

   public final int f2() {
      return ++this.e5;
   }

   public final int i1() {
      return ++this.b3;
   }

   public final int e5() {
      return ++this.o0;
   }

   public final int b3() {
      return ++this.z7;
   }

   public final InterruptionToken o0() {
      return this.u3;
   }

   final void n5(String var1, int var2) {
      if (this.z7() != null && this.z7().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.z7().getWarningCallback());
      }
   }

   final IPptxOptions z7() {
      return this.l6;
   }

   final void n5(IPptxOptions var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.c8m.d9 v4() {
      return this.a6();
   }

}
