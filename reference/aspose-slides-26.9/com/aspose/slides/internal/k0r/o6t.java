package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class o6t extends e6r {
   boolean n5 = true;
   private int l6 = 65535;
   private final List<l1b> k5 = new List<>();

   public final int l6() {
      return (this.l6 & 65535) == 65535 ? this.u3().size() & 65535 : this.l6;
   }

   public final boolean k5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final List<l1b> u3() {
      return this.k5;
   }

   public o6t() {
      this.w1().n5(4003);
      this.w1().n5((byte)0);
      this.w1().n5((short)4);
   }

   public o6t(int var1) {
      this.w1().n5(4003);
      this.w1().n5((byte)0);
      this.n5(var1, true);
   }

   public final void n5(int var1, boolean var2) {
      this.w1().n5((short)var1);
      this.u3().clear();
      l1b var3 = null;
      if (var2) {
         switch (var1) {
            case 0:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)44));
               var3.l6().n5(new m1(50331648L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               break;
            case 1:
               var3 = new l1b();
               var3.n5().n5((byte)1);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)216));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)32));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               break;
            case 2:
               var3 = new l1b();
               var3.n5().n5((byte)1);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)30));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)12));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
            case 3:
            default:
               break;
            case 4:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)288));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)576));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)864));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)864));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1152));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)1152));
               this.u3().addItem(var3);
               break;
            case 5:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)32));
               var3.l6().n5(new m1(50331648L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               break;
            case 6:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)44));
               var3.l6().n5(new m1(50331648L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               break;
            case 7:
               var3 = new l1b();
               var3.n5().n5((byte)1);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)216));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)28));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8211));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)468));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)24));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)720));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8211));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1008));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)864));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)187));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1296));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)1152));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               this.u3().addItem(var3);
               break;
            case 8:
               var3 = new l1b();
               var3.n5().n5((byte)1);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)216));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)24));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
         }
      } else {
         switch (var1) {
            case 0:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)44));
               var3.l6().n5(new m1(50331648L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               break;
            case 1:
               var3 = new l1b();
               var3.n5().n5((byte)1);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)216));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)32));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8211));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)468));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)28));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)720));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)24));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8211));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1008));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)864));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)187));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1296));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)1152));
               this.u3().addItem(var3);
               break;
            case 2:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)0);
               var3.n5().k5((byte)0);
               var3.n5().u3((byte)0);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)30));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)0);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)0);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)12));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)288));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)576));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)864));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)864));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1152));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)1152));
               this.u3().addItem(var3);
            case 3:
            default:
               break;
            case 4:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)1);
               var3.n5().k5((byte)1);
               var3.n5().u3((byte)1);
               var3.n5().n5(new com.aspose.slides.ms.System.o5<>((short)8226));
               var3.n5().l6(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().k5(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().n5(new m1(4278190080L));
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6(new com.aspose.slides.ms.System.o5<>((short)100));
               var3.n5().u9(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)0));
               var3.n5().s7(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().n5(new k3h());
               var3.n5().x8(new com.aspose.slides.ms.System.o5<>(0));
               var3.n5().a6((byte)1);
               var3.n5().u9((byte)1);
               var3.n5().h0((byte)1);
               var3.n5().n3(new com.aspose.slides.ms.System.o5<>(0));
               var3.l6().n5((byte)0);
               var3.l6().l6((byte)0);
               var3.l6().k5((byte)0);
               var3.l6().u3((byte)0);
               var3.l6().a6((byte)0);
               var3.l6().u9((byte)0);
               var3.l6().h0((byte)0);
               var3.l6().l6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().k5(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u3(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().a6(new com.aspose.slides.ms.System.o5<>(65535));
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               var3.l6().n5(new m1(16777216L));
               var3.l6().h0(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)288));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)288));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)576));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)576));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)864));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)864));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1152));
               var3.n5().t2(new com.aspose.slides.ms.System.o5<>((short)1152));
               this.u3().addItem(var3);
               break;
            case 5:
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)0);
               var3.n5().k5((byte)0);
               var3.n5().u3((byte)0);
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)0));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)288));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)0);
               var3.n5().k5((byte)0);
               var3.n5().u3((byte)0);
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)576));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)0);
               var3.n5().k5((byte)0);
               var3.n5().u3((byte)0);
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)864));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.n5().n5((byte)0);
               var3.n5().l6((byte)0);
               var3.n5().k5((byte)0);
               var3.n5().u3((byte)0);
               var3.n5().u3(new com.aspose.slides.ms.System.o5<>(1));
               var3.n5().c8(new com.aspose.slides.ms.System.o5<>((short)1152));
               this.u3().addItem(var3);
               break;
            case 6:
               var3 = new l1b();
               this.u3().addItem(var3);
               break;
            case 7:
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)28));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)24));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               this.u3().addItem(var3);
               break;
            case 8:
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)24));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)20));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)18));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)16));
               this.u3().addItem(var3);
               var3 = new l1b();
               var3.l6().u9(new com.aspose.slides.ms.System.o5<>((short)16));
               this.u3().addItem(var3);
         }
      }

      for (int var4 = 0; var4 < this.u3().size(); var4++) {
         this.u3().get_Item(var4).n5(var4 & 65535);
      }

      this.n5 = true;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.r4();
      this.u3().clear();

      for (int var2 = 0; var2 < (this.l6 & 65535); var2++) {
         l1b var3 = new l1b();
         var3.n5(var1, this.w1().k5());
         this.u3().addItem(var3);
      }

      this.n5 = false;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = this.u3().size();
      var1.n5((short)var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.u3().get_Item(var3).n5(var1, var3, this.w1().k5());
      }
   }

   @Override
   public int n5() {
      int var1 = this.u3().size();
      int var2 = 2;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 += this.u3().get_Item(var3).n5(this.w1().k5());
      }

      return var2;
   }

   public final void n5(o6t var1, boolean var2) {
      if (var1 != null) {
         if (!var2) {
            if (this.w1().k5() != var1.w1().k5()) {
               throw new ArgumentException("Current and specified TextMasterStyle atoms have different text types.");
            }

            if (this.w1().k5() != 0 && this.w1().k5() != 1 && this.w1().k5() != 4) {
               throw new InvalidOperationException("Only Title, Body and Other text tipes can be updated.");
            }
         }

         for (int var3 = 0; var3 < (var1.l6() & 65535); var3++) {
            if (this.u3().size() > var3) {
               this.u3().get_Item(var3).n5(var1.u3().get_Item(var3));
            } else {
               l1b var4 = new l1b(0);
               var4.n5(var1.u3().get_Item(var3));
               this.u3().addItem(var4);
            }
         }
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(com.aspose.slides.ms.System.d1.n5("TextMasterStyleAtom: Header.Instance: {0}; Levels count: {1}",new Object[]{ this.w1().k5(), this.u3().size()}));

      for (int var2 = 0; var2 < this.u3().size(); var2++) {
         var1.k5();
         var1.n5(com.aspose.slides.ms.System.d1.n5("{0}: {1}",new Object[]{ var2, this.u3().get_Item(var2)}));
      }

      return com.aspose.slides.ms.System.d1.n5(var1.toString(), "\n", "\n  ");
   }
}
