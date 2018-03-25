package me.exerosis.component.architecture.functions.compat;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public interface Function<Type, Return> extends com.google.common.base.Function<Type, Return>, io.reactivex.functions.Function<Type, Return> {
	static <Type> Function<Type, Optional<Type>> ofNullable() {
		return Optional::ofNullable;
	}
	
	@Nullable
	@Override
	Return apply(Type first);
}