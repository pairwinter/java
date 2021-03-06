package com.pairwinter.usage.generics.itfaceimpl;

import com.pairwinter.usage.generics.Result;
import com.pairwinter.usage.generics.itface.GenericsInterfaceWithGenericsInInterfaceName;

/**
 * Created with IntelliJ IDEA.
 * User: pairwinter
 * Date: 13-10-28
 * Time: 上午11:34
 * To change this template use File | Settings | File Templates.
 */
public class GenericsInterfaceImplWithGenericsInInterfaceName<T> implements GenericsInterfaceWithGenericsInInterfaceName<T> {
    @Override
    public Result fetchResult() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T1> T1 fetchResultWithGenericsDeclaration(T1 t1) {
        return t1;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static <T2> T2 fetchResultWithGenericsDeclarationStatic(T2 t2){
        return t2;
    }

    @Override
    public T fetchResultWithOutGenericsDeclaration(T t) {
        return t;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
