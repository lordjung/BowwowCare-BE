package com.bowwowcare.sm.domain.theme;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

    Optional<Theme> findThemeByMemberId(Long id);
}